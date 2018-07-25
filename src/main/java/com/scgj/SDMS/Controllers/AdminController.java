package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.Batches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

 @RequestMapping("/getPlacementReport")
    @ResponseBody
public ModelAndView getPlacementReport ()
{
    ModelAndView m = new ModelAndView("batchAssignment");

    List<Batches> l = adminService.getBatchDetail();

     m.addObject("data",l);

//    for(Batches b : l)
//    {
//        System.out.println(b.getAb_id()+"   " + b.getNo_of_candidates());
//    }
    return m;


}

}
