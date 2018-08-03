package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends CrudRepository<Location,Integer> {




}
