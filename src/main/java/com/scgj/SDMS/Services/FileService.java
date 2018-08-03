package com.scgj.SDMS.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

@Service
public class FileService {
    @Autowired
    LocationService locationService;

    @Autowired
    TPService tpService;

    @Autowired
    AssessmentBodyService assessmentBodyService;

    @Autowired
    AssessorService assessorService;

    @Autowired
    TrainerService trainerService;

    @Autowired
    TrainingCentereService trainingCentereService;



    @Autowired
    BatchService batchService;
    public void insertFile(InputStreamReader inputStreamReader, String fileName) throws IOException, ParseException {

        System.out.println("file service" + fileName);
        if (fileName.equals("location")) {
            locationService.createDB(inputStreamReader);
        } else if (fileName.equals("trainingPartner.csv")) {

            tpService.createDB(inputStreamReader);
        } else if (fileName.equals("assessmentAgency.csv")) {
            assessmentBodyService.createDB(inputStreamReader);
        }
        else if( fileName.equals("Assessor.csv"))
        {

            assessorService.createDB(inputStreamReader);
        }

        else if( fileName.equals("Trainer.csv"))
        {

            trainerService.createDB(inputStreamReader);
        }
        else if( fileName.equals("centre.csv"))
        {

            trainingCentereService.createDB(inputStreamReader);
        }
        else if( fileName.equals("Batch.csv"))
        {

            batchService.createDB(inputStreamReader);
        }


    }




}
