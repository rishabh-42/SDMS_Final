package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.AssessmentBody;
import com.scgj.SDMS.Models.Batch;
import com.scgj.SDMS.Models.Batches;
import com.scgj.SDMS.Repository.AssessmentBodyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class AdminController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    private AdminService adminService;

    @Autowired
    AssessmentBodyRepo assessmentBodyRepo;
 @RequestMapping("/SCGJDashboard")
    @ResponseBody
public ModelAndView getPlacementReport (HttpSession session)
{
    String se = session.getAttribute("loggedInUser") != null ? session.getAttribute("loggedInUser").toString() : null;
    if(se == null) {
        return new ModelAndView(new RedirectView("Login"));
    }
    else {
        ModelAndView mo = new ModelAndView("batchAssignment");



//        mo.addObject("ass",lm);
//


        List<Batch> l = adminService.getBatchDetail();
        List<Batch> m = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() <=-1).collect(Collectors.toList());

        mo.addObject("data", m);

        List<Batch> lo = adminService.getBatchDetail();

        List<Batch> m0 = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() >-1).collect(Collectors.toList());

        for(Batch kl :m0)
        {
            System.out.println( kl.getAssessmentBodyId().getAssessmentBodyId());
        }
        mo.addObject("approve", m0);


        List<Batch> loo = adminService.getBatchDetail();
        List<Batch> moo = loo.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() ==-2).collect(Collectors.toList());

        mo.addObject("reject", moo);


        return mo;
    }

}
    @GetMapping("/import")
     public ModelAndView impor()
    {
        return new ModelAndView("importPage");
    }


    @RequestMapping("/faq")
    @ResponseBody
    public ModelAndView faq()
    {
        ModelAndView m = new ModelAndView("faq");

        return m;
    }

    @RequestMapping("/getPlacementReportList")
    @ResponseBody
    public ModelAndView getPlacementReportList ()
    {
        ModelAndView m = new ModelAndView("placement");

        //List<Batches> l = adminService.getBatchDetail();

        //m.addObject("data",l);

//    for(Batches b : l)
//    {
//        System.out.println(b.getAb_id()+"   " + b.getNo_of_candidates());
//    }
        return m;


    }



    @RequestMapping("/approve/{id}")
    @ResponseBody
    public ModelAndView approve (@PathVariable String id) throws SQLException {
        //ModelAndView mo = new ModelAndView("batchAssignment");

        int i = Integer.parseInt(id);

        Connection con  = jdbcTemplate.getDataSource().getConnection();







        int k =1;
        PreparedStatement stmt=con.prepareStatement(" update batch1 set assessment_body_id = ? where batch_id = ?");
        stmt.setInt(1,k);
        stmt.setInt(2,i);
        int j=stmt.executeUpdate();

        ModelAndView mo = new ModelAndView("batchAssignment");

        List<Batch> l = adminService.getBatchDetail();
        List<Batch> m = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() <=-1).collect(Collectors.toList());

        mo.addObject("data", m);

        List<Batch> lo = adminService.getBatchDetail();

        List<Batch> m0 = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() >-1).collect(Collectors.toList());

        for(Batch kl :m0)
        {
            System.out.println( kl.getAssessmentBodyId().getAssessmentBodyId());
        }
        mo.addObject("approve", m0);


        List<Batch> loo = adminService.getBatchDetail();
        List<Batch> moo = loo.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() ==-2).collect(Collectors.toList());

        mo.addObject("reject", moo);


        //List<Batches> l = adminService.getBatchDetail();

        //m.addObject("data",l);

//    for(Batches b : l)
//    {
//        System.out.println(b.getAb_id()+"   " + b.getNo_of_candidates());
//    }

return mo;

    }

    @RequestMapping("/reject/{id}")
    @ResponseBody
    public ModelAndView reject (@PathVariable String id) throws SQLException {

        int i = Integer.parseInt(id);

        Connection con  = jdbcTemplate.getDataSource().getConnection();







        int k =-2;
        PreparedStatement stmt=con.prepareStatement(" update batch1 set assessment_body_id = ? where batch_id = ?");
        stmt.setInt(1,k);
        stmt.setInt(2,i);
        int j=stmt.executeUpdate();
        ModelAndView mo = new ModelAndView("batchAssignment");

        List<Batch> l = adminService.getBatchDetail();
        List<Batch> m = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() ==-1).collect(Collectors.toList());

        mo.addObject("data", m);

        List<Batch> lo = adminService.getBatchDetail();

        List<Batch> m0 = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() >-1).collect(Collectors.toList());

        for(Batch kl :m0)
        {
            System.out.println( kl.getAssessmentBodyId().getAssessmentBodyId());
        }
        mo.addObject("approve", m0);


        List<Batch> loo = adminService.getBatchDetail();
        List<Batch> moo = loo.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() ==-2).collect(Collectors.toList());

        mo.addObject("reject", moo);

        return mo;

        //List<Batches> l = adminService.getBatchDetail();

        //m.addObject("data",l);

//    for(Batches b : l)
//    {
//        System.out.println(b.getAb_id()+"   " + b.getNo_of_candidates());
//    }



    }
    @RequestMapping("/withdraw/{id}")
    @ResponseBody
    public ModelAndView withdraw(@PathVariable String id) throws SQLException {

        int i = Integer.parseInt(id);

        Connection con  = jdbcTemplate.getDataSource().getConnection();







        int k =-1;
        PreparedStatement stmt=con.prepareStatement(" update batch1 set assessment_body_id = ? where batch_id = ?");
        stmt.setInt(1,k);
        stmt.setInt(2,i);
        int j=stmt.executeUpdate();
        ModelAndView mo = new ModelAndView("batchAssignment");

        List<Batch> l = adminService.getBatchDetail();
        List<Batch> m = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() <=-1).collect(Collectors.toList());

        mo.addObject("data", m);

        List<Batch> lo = adminService.getBatchDetail();

        List<Batch> m0 = l.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() >-1).collect(Collectors.toList());

        for(Batch kl :m0)
        {
            System.out.println( kl.getAssessmentBodyId().getAssessmentBodyId());
        }
        mo.addObject("approve", m0);


        List<Batch> loo = adminService.getBatchDetail();
        List<Batch> moo = loo.stream().filter(x->x.getAssessmentBodyId().getAssessmentBodyId() ==-2).collect(Collectors.toList());

        mo.addObject("reject", moo);

        return mo;

        //List<Batches> l = adminService.getBatchDetail();

        //m.addObject("data",l);

//    for(Batches b : l)
//    {
//        System.out.println(b.getAb_id()+"   " + b.getNo_of_candidates());
//    }



    }



    @RequestMapping("/getOneRow/{batch_id}")
    public ModelAndView getOneRow(@PathVariable String batch_id)
    {
        ModelAndView m = new ModelAndView("batchAssignment");


        List<Batch> l = adminService.getBatchDetail();

        for(Batch i : l)
        {
            if(i.getBatchId()  == Integer.parseInt(batch_id))
            {
                m.addObject("data",i);
                break;
            }
        }

        return m;

    }

    @RequestMapping(value="/Logouts",method=RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        return new ModelAndView(new RedirectView("Login"));

    }
    @RequestMapping("/csvIntoTable")
        public void csvIntoTable() throws SQLException {

        Connection con = jdbcTemplate.getDataSource().getConnection();
///home/rishabh/Downloads/SDMS/src/main/resources/files
        Statement stmt =con.createStatement();

        int result = stmt.executeUpdate("");

        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/trainingPartner.csv' \n" +
                "INTO TABLE trainingPartners-- \n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (\n" +
                "trainingPartnerId  ,\n" +
                " applicationId , trainingPartnerName );");
        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/Trainer.csv' \n" +
                "INTO TABLE trainer\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (\n" +
                "trainerId , trainerName , \n" +
                " designation  , trainingPartnerId    );");
        result = stmt.executeUpdate("\n" +
                "LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/Employer.csv' \n" +
                "INTO TABLE employerr\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (employer, employerName ,\n" +
                " locationofEmployer , locationOfEmployerDistrict,  \n" +
                " locationOfEmployerState   );");

        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/candidate.csv' \n" +
                "INTO TABLE candidatee\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (candidateDetailsId, candidateName, enrollmentNumber  , \n" +
                "gender , dateOfBirth ,\n" +
                " nameOfFatherorHusband  , \n" +
                " adharNo , mobileNo ,\n" +
                " emailId , educationLevel  ,\n" +
                " traineeAddress,  traineePinCode , marksObtainedTheory  ,\n" +
                " marksObtainedPractical  , result  , certified  , \n" +
                " placementStatus  , dateOfJoining, employmentType   ,batchId , employerId  );");

        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/Assessor.csv' \n" +
                "INTO TABLE asssessorr\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (assessorId , assessorName , district ,state  , agencyId  );");
        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/Batch.csv' \n" +
                "INTO TABLE batchess\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (batchId ,batchName , batchType ,trainingPartnerId ,\n" +
                "centerId , trainerId ,totalCandidate ,batchMode,batchStartDate ,\n" +
                "batchEndDate ,jobRole , jobRoleCode ,maximumMarksTheory  ,\n" +
                "maximumMarksPractical ,level ,resultApproved , \n" +
                "resultApprovedOnDate , totalPass , totalFail  ,\n" +
                "totalNotAppeared , totalCertified, batchAssignment  ,\n" +
                " assessmentDate ,agencyId ,assessorId  );");

        result = stmt.executeUpdate("LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/SDMS/src/main/resources/files/assessmentAgency.csv' \n" +
                "INTO TABLE assessmentAgency \n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (agencyId ,applicationId ,agencyName   );");


        result = stmt.executeUpdate("delete from trainingPartners where trainingPartnerId ='Any';");
        result = stmt.executeUpdate("delete from trainer where trainerId ='Any';");
        result = stmt.executeUpdate("delete from employerr where locationofEmployer ='Any';");
        result = stmt.executeUpdate("delete from centre where centreAddress ='Any';");
        result = stmt.executeUpdate("delete from candidatee where candidateDetailsId ='Any';");
        result = stmt.executeUpdate("delete from asssessorr where assessorId ='Integer';");
        result = stmt.executeUpdate("delete from batchess where batchId = 'String';");
        result = stmt.executeUpdate("delete from assessmentAgency where agencyId = 'Integer';");






    }


}
