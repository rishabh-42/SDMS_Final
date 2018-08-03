package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.TrainingCenter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCRepo extends CrudRepository<TrainingCenter,Integer> {
    TrainingCenter findByTrainingCenterId(int i);
}
