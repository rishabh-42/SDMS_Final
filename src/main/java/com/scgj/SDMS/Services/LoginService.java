package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.User;
import com.scgj.SDMS.Repository.ILoginRepository;
import com.scgj.SDMS.Repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService{
    @Autowired
    ILoginRepository iLoginRepository;
    public User validateUser(User user){
        User loginStatus=iLoginRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
        return loginStatus;
    }
 public User find(String email){
        User emailReturn=iLoginRepository.findByEmail(email);
        return emailReturn;
 }

//        if(loginStatus.getType().equals("Training partner")){
//            return 1;
//        }
//        else if(loginStatus.getType().equals("Assessment Body")){
//            return 2;
//        }
//        else if (loginStatus.getType().equals("Admin")){
//            return 3;
//        }
//        else{
//            return 4;
//        }

}
