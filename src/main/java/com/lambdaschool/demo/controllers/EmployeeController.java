package com.lambdaschool.demo.controllers;

import com.lambdaschool.demo.models.Employee;
import com.lambdaschool.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository emprepos;

    //https://locahost:2019/employees
    @GetMapping(value = "/employees", produces = {"application/json"})
    public ResponseEntity<?> listAllEmployees()
    {
        List<Employee> employeeList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(employeeList::add);
        //findAll()returns an iterator, then add them to the list
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
}
