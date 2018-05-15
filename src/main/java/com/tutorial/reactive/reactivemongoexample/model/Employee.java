package com.tutorial.reactive.reactivemongoexample.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Employee {

    @Id
    private String id;
    private String name;
    private Long salary;

    public Employee(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
