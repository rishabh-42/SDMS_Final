package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.AbFormModel;
import com.scgj.SDMS.Repository.AbRepositoryForm;
import com.scgj.SDMS.Repository.AbRepositoryForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbFormService {
    @Autowired
    private AbRepositoryForm abRepositoryForm;

    public void abform(AbFormModel aform)// AbFormModel is model
    {
        System.out.println(aform);
       abRepositoryForm.save(aform);
    }

    /*public List<AbFormModel> findabId(AbFormModel abFormModel) {
        return abRepositoryForm.findByabId(abFormModel.getAssessmentBodyId());*/


    }
