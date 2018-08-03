package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.AssessmentBody;
import com.scgj.SDMS.Models.TrainingPartner;
import com.scgj.SDMS.Repository.ApplicationRepo;
import com.scgj.SDMS.Repository.AssessmentBodyRepo;
import com.scgj.SDMS.Repository.TPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class AssessmentBodyService {




    @Autowired
    ApplicationRepo applicationRepo;

    @Autowired
    AssessmentBodyRepo assessmentBodyRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<AssessmentBody> l = new ArrayList<>();

        String row;
        int i = 0;
        while ((row = bufferedReader.readLine()) != null) {
            if (i > 1) {

                AssessmentBody assessmentBody = new AssessmentBody();
                String[] s = row.split(",");
                assessmentBody.setAssessmentBodyId(Integer.parseInt(s[0]));
                try {
                    assessmentBody.setApplicationId(assessmentBodyRepo.findByApplicationId(Integer.parseInt(s[1])));
                } catch (Exception ex) {
                    assessmentBody.setApplicationId(null);
                }

                assessmentBody.setAssessmentBodyName(s[2]);

                l.add(assessmentBody);


            }
            i++;
        }
        assessmentBodyRepo.save(l);


    }
}

