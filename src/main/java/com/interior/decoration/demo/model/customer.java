package com.interior.decoration.demo.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@ToString
@Document(collection="customer")
public class customer {

    @Id
    private ObjectId id;
    private String cusId;
    private String cusName;
    private int age;
    private String cusSex;
    private String cusEmailId;


}
