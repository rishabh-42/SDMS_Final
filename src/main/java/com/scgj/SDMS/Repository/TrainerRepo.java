package com.scgj.SDMS.Repository;


import com.scgj.SDMS.Models.Trainer;
import com.scgj.SDMS.Models.TrainingPartner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepo extends CrudRepository<Trainer,Integer> {
    Trainer findByTrainerId(int i);


//    TrainingPartner findByTrainerPartnerId(int i);
}
