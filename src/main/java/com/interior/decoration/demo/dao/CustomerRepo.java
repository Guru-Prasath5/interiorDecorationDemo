package com.interior.decoration.demo.dao;

import com.interior.decoration.demo.model.customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo  extends MongoRepository<customer, String> {
}
