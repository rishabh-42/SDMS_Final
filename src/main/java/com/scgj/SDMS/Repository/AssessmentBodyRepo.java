package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Application;
import com.scgj.SDMS.Models.AssessmentBody;
import com.scgj.SDMS.Models.Assessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentBodyRepo extends CrudRepository<AssessmentBody,Integer> {

    Application findByApplicationId(int i);

    AssessmentBody findByAssessmentBodyId(int i);

}
