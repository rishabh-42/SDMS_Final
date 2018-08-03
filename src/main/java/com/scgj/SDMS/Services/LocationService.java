package com.scgj.SDMS.Services;

import com.scgj.SDMS.Controllers.LocationRepo;
import com.scgj.SDMS.Models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {


    @Autowired
    LocationRepo locationRepo;

    public void createDB(InputStreamReader inputStreamReader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        List<Location> l = new ArrayList<>();

        String row;
        int i =0;
        while ((row=bufferedReader.readLine())!=null)
        {
            if(i>1)
            {
                Location loc = new Location();
                String[] s = row.split(",");
                loc.setLocationId(Integer.parseInt(s[0]));
                loc.setDistrict(s[1]);
                loc.setState(s[2]);
                l.add(loc);



            }
            i++;
        }
    locationRepo.save(l);

    }
}
