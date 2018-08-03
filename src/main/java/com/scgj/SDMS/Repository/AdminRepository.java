package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Batch,Integer> {

//

    List<Batch> findAll();



}
