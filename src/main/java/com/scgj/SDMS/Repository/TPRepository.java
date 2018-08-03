package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.TrainingCenter;
import com.scgj.SDMS.Models.TrainingPartner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TPRepository extends CrudRepository <TrainingPartner,Integer> {


     TrainingPartner findByTrainerPartnerId(int i) ;


}
