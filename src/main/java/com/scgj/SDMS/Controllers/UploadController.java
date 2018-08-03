package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class UploadController {


    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "/home/rishabh/Downloads/SDMS/src/main/resources/files/";

    @GetMapping("/")
    public String index() {
        return "Login";
    }

  @RequestMapping("/upload") // //new annotation since 4.3
//@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        System.out.println("hello");

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {

        return "uploadStatus";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/createDB")
    public String createDb () throws SQLException {

        Connection con = jdbcTemplate.getDataSource().getConnection();

        String q = " LOAD DATA LOCAL INFILE '/home/rishabh/Downloads/tp.csv' \n" +
                "INTO TABLE test\n" +
                "FIELDS TERMINATED BY ',' \n" +
                "ENCLOSED BY '\"'\n" +
                "LINES TERMINATED BY '\\n'\n" +
                "IGNORE 1 LINES (trainingPartnerId, applicationId, trainingPartnerName);";
        Statement p = con.createStatement();
        int i = p.executeUpdate(q);
        System.out.println("hi");

     return "upload";



    }

    @Autowired
    FileService fileService;


    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> uploadFile(

            @RequestParam("uploadfile") MultipartFile uploadfile) {

        try {
            // Get the filename and build the local file path (be sure that the
//            // application have write permissions on such directory)
            String filename = uploadfile.getOriginalFilename();
            String directory = "/home/rishabh/Downloads/SDMS/src/main/resources/files/";
            String filepath = Paths.get(directory, filename).toString();


            byte[] bytes = uploadfile.getBytes();

            System.out.println("filename"+filename);
            System.out.println("filepath"+filepath);
//            // Save the file locally
//




            InputStream inputStream = uploadfile.getInputStream();
            String destination = "/home/rishabh/Downloads/SDMS/src/main/resources/files/";
            File dir = new File(directory);

            File newFile = new File(uploadfile.getOriginalFilename());

            if (!dir.exists()) {
                dir.mkdir();
            }



            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileService.insertFile(new InputStreamReader(inputStream),filename);




            BufferedOutputStream stream =
                    new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(uploadfile.getBytes());
 stream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    } // method uploadFile


}