package com.scgj.SDMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

 @RequestMapping("/getPlacementReport")
    @ResponseBody
public ModelAndView getPlacementReport ()
{
    ModelAndView m = new ModelAndView("batchAssignment");
    return m;
}
}
