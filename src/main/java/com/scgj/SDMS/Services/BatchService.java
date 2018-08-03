package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.Assessor;
import com.scgj.SDMS.Models.Batch;
import com.scgj.SDMS.Models.TrainingCenter;
import com.scgj.SDMS.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class BatchService {


    @Autowired
    TPRepository tpRepository;

    @Autowired
    TCRepo tcRepo;

    @Autowired
    BatchRepo batchRepo;
    @Autowired
    TrainerRepo trainerRepo;
    @Autowired
    AssessmentBodyRepo assessmentBodyRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException, ParseException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Batch> batch1 = new ArrayList<>();
        String line;
        int i;
        i = 0;


        while ((line = bufferedReader.readLine()) != null) {

            if (i > 1) {
                Batch batch = new Batch();
                String[] batchData = line.split(",");


                batch.setBatchId(Integer.parseInt(batchData[0]));
                batch.setBatchName(batchData[1]);


                if (batchData[2].equals("")) {
                    batch.setBatchType("PMKVY");
                } else {
                    batch.setBatchType(batchData[2].toUpperCase().replace("_", "-"));
                }

                try {


                    batch.setTrainingPartnerId(tpRepository.findByTrainerPartnerId(Integer.parseInt(batchData[3])));
                } catch (Exception e) {
                    batch.setTrainingPartnerId(null);
                }

                try {


                    batch.setTrainerId(trainerRepo.findByTrainerId(Integer.parseInt(batchData[5])));
                } catch (Exception e) {
                    batch.setTrainerId(null);
                }


                try {
                    batch.setTrainingCenterId(tcRepo.findByTrainingCenterId(Integer.parseInt(batchData[4])));
                } catch (Exception e) {
                    batch.setTrainingCenterId(null);
                }


                batch.setBatchMode(batchData[7]);
                batch.setBatchStrength(batchData[6]);
                try {
                    //batch.setBatchStartDate(new SimpleDateFormat("dd/mm/yy").parse(batchData[8].replace("-", "/")));
                } catch (Exception e) {
                    batch.setBatchStartDate(null);
                }


                try {
                    //batch.setBatchEndDate(new SimpleDateFormat("dd/mm/yy").parse(batchData[9].replace("-", "/")));
                } catch (Exception e) {
                    batch.setBatchStartDate(null);
                }

//                try{
//                    batch.setQualificationPack(qualificationPackRepository.findByQualificationPackName(batchData[10]));
//                }
//                catch(Exception e)
//                {
//                    batch.setQualificationPack(null);
//                }
//                try {
//                    batch.setMaxMarksTheory(BigDecimal.valueOf(Double.parseDouble(batchData[12])));
//                }
//                catch (Exception e)
//                {
//                    batch.setMaxMarksTheory(BigDecimal.valueOf(0.0));
//
//                }
//                try {
//                    batch.setMaxMarksPractical(BigDecimal.valueOf(Double.parseDouble(batchData[13])));
//                }
//                catch (Exception e)
//                {
//                    batch.setMaxMarksTheory(BigDecimal.valueOf(0.0));
//
//                }
//
//                try
//                {
//                    batch.setLevel(Integer.parseInt(batchData[14]));
//                }
//                catch(Exception e)
//                {
//                    batch.setLevel(0);
//                }
                String result = batchData[15];
                if (result.equals("Yes")) {
                    batch.setResultApproved(true);
                    //batch.setResultApprovedDate(new SimpleDateFormat("dd/mm/yy").parse(batchData[16].replace("-", "/")));
                } else {
                    batch.setResultApproved(false);
                    batch.setResultApprovedDate(null);
                }


                try {
                    //batch.setBatchAssignmentDate(new SimpleDateFormat("dd/mm/yy").parse(batchData[21].replace("-", "/")));
                } catch (Exception e) {
                    batch.setBatchAssignmentDate(null);
                }


                try {
                    //batch.setAssessmentDate(new SimpleDateFormat("dd/mm/yy").parse(batchData[22].replace("-", "/")));
                } catch (Exception e) {
                    batch.setAssessmentDate(null);
                }

                batch.setAssessmentBodyId(assessmentBodyRepo.findByAssessmentBodyId(Integer.parseInt(batchData[23])));


                try {
                    batch.setTrainerId(trainerRepo.findByTrainerId(Integer.parseInt(batchData[5])));
                } catch (Exception e) {
                    batch.setTrainerId(null);

                }
                batch.setTotalPass(Integer.parseInt(batchData[17]));
                batch.setTotalFail(Integer.parseInt(batchData[18]));
                batch.setTotalAppeared(Integer.parseInt(batchData[19]));
                batch.setTotalCertified(Integer.parseInt(batchData[20]));

                batch1.add(batch);
            }
            i++;


            batchRepo.save(batch1);
        }

    }
}
