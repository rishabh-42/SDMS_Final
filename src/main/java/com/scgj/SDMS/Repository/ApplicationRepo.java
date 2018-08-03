package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends CrudRepository<Application,Integer> {
    Application findByApplicationId(int i);
}
