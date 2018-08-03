package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.DataSource;
import java.io.*;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FileUploader {

    @Autowired
    FileService fileService;

    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping(value = "/upload/file",method = RequestMethod.POST)
    @ResponseBody
    String uploadFile(@RequestParam String fileName, @RequestParam MultipartFile file) {

        try {

            byte[] bytes = file.getBytes();

            InputStream inputStream = file.getInputStream();
            String destination = "/home/rishabh/Downloads/SDMS/src/main/resources/files/";
            File dir = new File(destination);

            if (!dir.exists()) {
                dir.mkdir();
            }

            File newFile = new File(file.getOriginalFilename());

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
            fileService.insertFile(new InputStreamReader(inputStream), fileName);
            // Save the file locally

            Connection con = jdbcTemplate.getDataSource().getConnection();


            String q ="insert into import_history (data_type,date,file_name,uploaded_by) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(q);

            stmt.setString(1,"CSV");




            return "Uploaded file " + fileName;



        } catch (Exception e) {

        }


        return fileName;
    }







}
