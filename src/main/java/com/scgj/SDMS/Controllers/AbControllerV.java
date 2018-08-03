package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.AbFormModel;
import com.scgj.SDMS.Models.Batch;
//import com.scgj.SDMS.Services.AbDashboardService;
import com.scgj.SDMS.Services.AbFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AbControllerV {

    @Autowired
     AbFormService abFormService;

    @RequestMapping(value = "/ABForm", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView ab_form_get(HttpSession session) {

        ModelAndView modelAndView = new ModelAndView("My_AB_form");
        modelAndView.addObject("aform", new AbFormModel()); //binding model class with object ab. will be used in thymeleaf
        return modelAndView;
    }


    @RequestMapping(value = "/ABForm", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView ab_form_post(@Valid AbFormModel aform, BindingResult bindingResult) {


        abFormService.abform(aform);
        ModelAndView modelAndView = new ModelAndView("Ab_Form_View");
        modelAndView.addObject("aform", new AbFormModel());

        return modelAndView;

    }

//    @RequestMapping(value = "/uploadFilev", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<?> uploadFile(
//            @RequestParam("uploadfile") MultipartFile uploadfile) {
//        System.out.println("above try");
//
//        try {
//
//            String filename = uploadfile.getOriginalFilename();
//            String directory = "C:\\Users\\Vishakha\\IdeaProjects\\SDMS\\src";
//            String filepath = Paths.get(directory, filename).toString();
//            System.out.println("java debug");
//
//            // Save the file locally
//            BufferedOutputStream stream =
//                    new BufferedOutputStream(new FileOutputStream(new File(filepath)));
//            stream.write(uploadfile.getBytes());
//            stream.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    } // method uploadFile
//    @Autowired
//    AbDashboardService abDashboardService;
//    @RequestMapping("/ABDashboard")
//    @ResponseBody
//    public ModelAndView AB_dashboard(HttpSession session) {
//        /*String se=session.getAttribute("loggedInUser") !=null ?  session.getAttribute("loggedInUser").toString() :null;
//        if (se==null){return new ModelAndView(new RedirectView("Login"));}
//        else{*/
//        ModelAndView modelAndView = new ModelAndView("AbDashboard");
//
//       List<Batch> ls=abDashboardService.abfun();
//      ls.forEach(y -> System.out.println(y.getBatchStrength()));
//
//        modelAndView.addObject("vishakha",1);
//       return modelAndView;
//    }
  /*  }*/

    @RequestMapping("/logout3")
    public ModelAndView logout3(HttpSession session){
        /*System.out.println("andar aa gya");*/
        session.invalidate();
        return new ModelAndView(new RedirectView("Login"));
    }

}





