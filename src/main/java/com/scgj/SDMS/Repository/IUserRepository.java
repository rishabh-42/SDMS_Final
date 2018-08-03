package com.scgj.SDMS.Repository;

import com.scgj.SDMS.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
    List<User> findByEmail(String user);
}
