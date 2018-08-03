package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.Assessor;
import com.scgj.SDMS.Models.Trainer;
import com.scgj.SDMS.Repository.AssessmentBodyRepo;
import com.scgj.SDMS.Repository.AssessorRepo;
import com.scgj.SDMS.Repository.TPRepository;
import com.scgj.SDMS.Repository.TrainerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerService {

    @Autowired
    AssessmentBodyRepo assessmentBodyRepo;
    @Autowired
    AssessorRepo assessorRepo;

    @Autowired
    TrainerRepo trainerRepo;

    @Autowired
    TPRepository tpRepository;



    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Trainer> l = new ArrayList<>();

        String row;
        int i = 0;
        while ((row = bufferedReader.readLine()) != null) {
            if (i > 1) {


                Trainer a = new Trainer();


                String[] s = row.split(",");

                a.setTrainerId(Integer.parseInt(s[0]));

                a.setTrainerName(s[1]);


                a.setTarinerDesignation(null);
                a.setLocationId(null);

                a.setTarinerDesignation(s[2]);
                try {
                    System.out.println("yaha aya " +Integer.parseInt(s[3]));
                    a.setTrainingPartnerId(tpRepository.findByTrainerPartnerId(Integer.parseInt(s[3])));
                } catch (Exception ex) {

                }

                l.add(a);


            }
            i++;
        }
        trainerRepo.save(l);


    }
}
