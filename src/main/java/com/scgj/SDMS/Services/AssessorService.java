package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.AssessmentBody;
import com.scgj.SDMS.Models.Assessor;
import com.scgj.SDMS.Repository.AssessmentBodyRepo;
import com.scgj.SDMS.Repository.AssessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AssessorService {

    @Autowired
    AssessmentBodyRepo assessmentBodyRepo;
    @Autowired
    AssessorRepo assessorRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Assessor> l = new ArrayList<>();

        String row;
        int i = 0;
        while ((row = bufferedReader.readLine()) != null) {
            if (i > 1) {


                Assessor a = new Assessor();
                String[] s = row.split(",");
                a.setAssessorId(Integer.parseInt(s[0]));
                try {
                    a.setAssessorName(s[1]);
                } catch (Exception ex) {
                }

                a.setLocation(s[3]);
                try {

                    a.setAssessmentBodyId(assessmentBodyRepo.findByAssessmentBodyId(Integer.parseInt(s[4])));
                }
                catch (Exception ex)
                {
                    a.setAssessmentBodyId(null);
                }

                l.add(a);


            }
            i++;
        }
        assessorRepo.save(l);


    }
}
