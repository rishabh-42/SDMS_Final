package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends CrudRepository<User,Integer> {
    User findByEmailAndPassword(String Email, String Password);
    User findByEmail(String Email);
}

