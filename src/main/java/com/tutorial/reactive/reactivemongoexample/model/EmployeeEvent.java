package com.tutorial.reactive.reactivemongoexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class EmployeeEvent {

    Employee employee;
    Date date;

    public EmployeeEvent(Employee employee, Date date) {
        this.employee = employee;
        this.date = date;
    }
}
