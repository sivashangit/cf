package com.example.cfemployee.service;

import com.example.cfemployee.model.Employee;
import com.example.cfemployee.repository.EmployeeRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.CompletableFuture;

@Service
public class EmployeeService {


    private Logger logger= LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee createEmployee( Employee employee){

        logger.info("inside createEmployee service....");

         return employeeRepo.save(employee);



    }

    public CompletableFuture<Employee> createcfemployee(Employee employee){

       return CompletableFuture.supplyAsync(()->employeeRepo.save(employee));

    }


}
