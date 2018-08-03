package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.AbFormModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface AbRepositoryForm extends CrudRepository<AbFormModel,Integer> { //abformmodel
   /* List<AbFormModel> findByabId(String abFormModel);*/


    }

