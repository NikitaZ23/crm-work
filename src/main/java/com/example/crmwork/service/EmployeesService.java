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
    EmployeesRepos employeesRepos;

    @Autowired
    EPCService epcService;

    public EmployeesService(EmployeesRepos repos) {
        this.employeesRepos = repos;
    }

    public void createEmployee(Employees employees){
        employeesRepos.save(employees);
    }

    public void deleteEmployee(Employees employees){
        epcService.findByIDE(employees.getId()).forEach(epc -> epcService.deleteEPC(epc));
        employeesRepos.delete(employees);
    }

    public void deleteAll(){
        employeesRepos.findAll().forEach(employees -> epcService.findByIDE(employees.getId()).forEach(epc -> epcService.deleteEPC(epc)));
        employeesRepos.deleteAll();
    }

    public List<Employees> findAll(){
        return employeesRepos.findAll();
    }

    public Employees findById(UUID id){
        return employeesRepos.findById(id).orElse(null);
    }
}
