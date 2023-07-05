package com.example.reactive_web_app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Invoice {

    @Id
    private Integer id;
    private String name;
    private String number;
    private Double amount;

}
