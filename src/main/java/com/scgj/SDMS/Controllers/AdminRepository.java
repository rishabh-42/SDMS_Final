package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.Batches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Batches,Integer> {

//

    List<Batches> findAll();



}
