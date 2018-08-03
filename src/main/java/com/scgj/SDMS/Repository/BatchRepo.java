package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Batch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepo extends CrudRepository<Batch,Integer> {
}
