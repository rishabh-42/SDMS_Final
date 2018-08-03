package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.User;
import com.scgj.SDMS.Repository.IUserRepository;
import com.scgj.SDMS.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${formSuccess.message:*This Email is Already Registered with us*.}")
    private String message;
    @RequestMapping(value="/register",method=RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView=new ModelAndView("Registration");
        modelAndView.addObject("user",new User());
        return  modelAndView;
    }

    @RequestMapping(value="/register",method=RequestMethod.POST)
    public ModelAndView formSuccess(@ModelAttribute User user){

        List<User> list=userService.findUser(user);
        if(list.size()==0){
         userService.saveUser(user);
         }
        else{
            ModelAndView model=new ModelAndView("Registration");
            return model.addObject("message", this.message);
        }
        return new ModelAndView(new RedirectView("Login"));

    }
}
