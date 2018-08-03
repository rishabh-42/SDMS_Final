package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.User;
import com.scgj.SDMS.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Value("${formSuccess.message:*Please Enter Valid Email and Password*}")
    private String message;
    @RequestMapping(value="/Login",method=RequestMethod.GET)
    public ModelAndView getLogin(HttpSession session){
        String se = session.getAttribute("loggedInUser") != null ? session.getAttribute("loggedInUser").toString() : null;
        if(se == null) {
            ModelAndView modelAndView = new ModelAndView("Login");
            modelAndView.addObject("Login", new User());
            return modelAndView;
        } else {
            User user = loginService.find(se);
            if (user.getType().equals("Assessment Body")) {
                return new ModelAndView(new RedirectView("ABForm"));
//                return new ModelAndView(new RedirectView("SCGJDashboard"));
            } else if (user.getType().equals("Admin")) {
                return new ModelAndView(new RedirectView("SCGJDashboard"));

            } else  {
              //  return new ModelAndView("TP");
                return new ModelAndView(new RedirectView("getPlacementReport"));
            }

        }
    }



    @RequestMapping(value="/Login",method=RequestMethod.POST)
    public ModelAndView formSuccess(@ModelAttribute User responseData, HttpSession session) {
        User loginStatus = loginService.validateUser(responseData);
        if (loginStatus != null) {
            if (loginStatus.getType().equals("Assessment Body")) {
                session.setAttribute("loggedInUser", loginStatus.getEmail());
                return new ModelAndView(new RedirectView("ABForm"));

//                return new ModelAndView(new RedirectView("SCGJDashboard"));
            } else if (loginStatus.getType().equals("Admin")) {
                session.setAttribute("loggedInUser", loginStatus.getEmail());
                return new ModelAndView(new RedirectView("SCGJDashboard"));

            } else  {
                session.setAttribute("loggedInUser", loginStatus.getEmail());
                //return new ModelAndView("TP");
               return new ModelAndView(new RedirectView("getPlacementReport"));

            }
        } else {
            ModelAndView model=new ModelAndView("Login");
            return model.addObject("message", this.message);
    }
    }

    @RequestMapping(value="/Logout",method=RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
      // session.removeAttribute("loggedInUSer");
        return new ModelAndView(new RedirectView("Login"));

    }
}
