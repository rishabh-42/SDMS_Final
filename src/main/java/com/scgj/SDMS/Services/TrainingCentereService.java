package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.TrainingCenter;
import com.scgj.SDMS.Models.TrainingPartner;
import com.scgj.SDMS.Repository.TCRepo;
import com.scgj.SDMS.Repository.TPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingCentereService {

    @Autowired
    TPRepository tpRepository;

    @Autowired
    TCRepo tcRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<TrainingCenter> l = new ArrayList<>();

        String row;
        int i = 0;
        while ((row = bufferedReader.readLine()) != null) {
            if (i > 1) {
                TrainingCenter trainingCenter = new TrainingCenter();
                String[] s = row.split(",");
                    trainingCenter.setTrainingCenterId(Integer.parseInt(s[0]));

                trainingCenter.setTrainingCenterName(s[1]);
                trainingCenter.setLocationId(null);

                try
                {
                    trainingCenter.setTrainerPartnerId(tpRepository.findByTrainerPartnerId(Integer.parseInt(s[6])));
                }catch(Exception e)
                {
                    trainingCenter.setTrainerPartnerId(null);
                }

                l.add(trainingCenter);


            }
            i++;
        }
        tcRepo.save(l);

    }


}
