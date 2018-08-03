package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.Application;
import com.scgj.SDMS.Models.Location;
import com.scgj.SDMS.Models.TrainingPartner;
import com.scgj.SDMS.Repository.ApplicationRepo;
import com.scgj.SDMS.Repository.TPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class TPService {

    @Autowired
    TPRepository tpRepository;

    @Autowired
    ApplicationRepo applicationRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<TrainingPartner> l = new ArrayList<>();

        String row;
        int i = 0;
        while ((row = bufferedReader.readLine()) != null) {
            if (i > 1) {
                TrainingPartner trainingPartner = new TrainingPartner();
                String[] s = row.split(",");
                try {
                    trainingPartner.setApplication(applicationRepo.findByApplicationId(Integer.parseInt(s[0])));
                } catch (Exception ex) {
                    trainingPartner.setApplication(null);
                }

                trainingPartner.setTrainerPartnerId(Integer.parseInt(s[0]));
                trainingPartner.setTrainingPartnerName(s[2]);

                l.add(trainingPartner);


            }
            i++;
        }
        tpRepository.save(l);

    }

}
