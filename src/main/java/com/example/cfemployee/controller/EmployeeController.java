package com.example.cfemployee.controller;

import com.example.cfemployee.model.Employee;
import com.example.cfemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

   /* @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.createcfemployee(employee), HttpStatus.OK);

    }*/

    @PostMapping("/cfemployee")
    public CompletableFuture<ResponseEntity<Employee>> createEmp(@RequestBody Employee employee){
        return employeeService.createcfemployee(employee)
                .thenApply(ResponseEntity::ok);
    }


    @GetMapping("/")
    public String welocme(){

        return "welcome";
    }
}
