package com.interior.decoration.demo.service;

import com.interior.decoration.demo.dao.CustomerRepo;
import com.interior.decoration.demo.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceCustomer {



    @Autowired
    CustomerRepo cusRepo;



        public List<customer> findAll(){
        return cusRepo.findAll();
    }

    public customer createCustomer(customer cus){

        return cusRepo.save(cus);
    }
}
