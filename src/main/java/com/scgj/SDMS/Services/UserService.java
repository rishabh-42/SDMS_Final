package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.User;
import com.scgj.SDMS.Repository.IUserRepository;
import com.scgj.SDMS.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository iUserRepository;
    public void saveUser(User user){
        iUserRepository.save(user);
    }

    public List<User> findUser(User user) {
        return iUserRepository.findByEmail(user.getEmail());
    }
}
