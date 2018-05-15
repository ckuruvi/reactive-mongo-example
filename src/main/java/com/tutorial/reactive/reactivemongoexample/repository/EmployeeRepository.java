package com.tutorial.reactive.reactivemongoexample.repository;

import com.tutorial.reactive.reactivemongoexample.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {


}
