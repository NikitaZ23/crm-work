package com.example.crmwork.service;

import com.example.crmwork.domain.Employees;
import com.example.crmwork.repos.EmployeesRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepos repos;

    public EmployeesService(EmployeesRepos repos) {
        this.repos = repos;
    }

    public void createEmployee(Employees employees){
        repos.save(employees);
    }

    public void deleteEmployee(Employees employees){
        repos.delete(employees);
    }

    public void deleteAll(){
        repos.deleteAll();
    }

    public List<Employees> findAll(){
        return repos.findAll();
    }

    public Employees findById(UUID id){
        return repos.findById(id).orElse(null);
    }
}
