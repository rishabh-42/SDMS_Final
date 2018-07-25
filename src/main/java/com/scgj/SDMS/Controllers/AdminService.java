package com.scgj.SDMS.Controllers;


import com.scgj.SDMS.Models.Batches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {


    @Autowired
    private AdminRepository adminRepository;

    public List<Batches> getBatchDetail ()
    {
        List<Batches> l = new ArrayList<>();

        adminRepository.findAll().forEach((e)->l.add((e)));
        return l;

    }


}
