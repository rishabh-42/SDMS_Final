package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Assessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessorRepo extends CrudRepository<Assessor,Integer> {


}
