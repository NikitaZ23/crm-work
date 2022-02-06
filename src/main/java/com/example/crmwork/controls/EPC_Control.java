package com.example.crmwork.controls;

import com.example.crmwork.domain.Clients;
import com.example.crmwork.domain.Employees;
import com.example.crmwork.service.ClientsService;
import com.example.crmwork.service.EPCService;
import com.example.crmwork.service.EmployeesService;
import com.example.crmwork.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/epc")
public class EPC_Control {
    @Autowired
    ClientsService clientsS;

    @Autowired
    EmployeesService employeesS;

    @Autowired
    EPCService epcS;

    @Autowired
    ProjectsService projectsS;

    //////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/clients")
    List<Clients> getAllClients() {
        return clientsS.findAll();
    }

    @PostMapping("/client")
    ResponseEntity<Void> createClient(@RequestBody Clients clients){
        clientsS.createClient(clients);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/client")
    ResponseEntity<Void> createClient(@RequestParam(value = "name") String name,
                                      @RequestParam(value = "family") String family,
                                      @RequestParam(value = "oth") String oth,
                                      @RequestParam(value = "years") int years,
                                      @RequestParam(value = "sex") String sex){

        clientsS.createClient(new Clients(name,family,oth,years,sex));
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/client")
    ResponseEntity<Void> deleteClient(@RequestBody Clients clients){
        clientsS.deleteClient(clients);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/clients")
    ResponseEntity<Void> deleteClients(){
        clientsS.deleteClients();
        return ResponseEntity.ok().build();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/employees")
    List<Employees> getAllEmp() {
        return employeesS.findAll();
    }

    @PostMapping("/employee")
    ResponseEntity<Void> createEmp(@RequestBody Employees employees){
        employeesS.createEmployee(employees);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/employee")
    ResponseEntity<Void> createEmp(@RequestParam(value = "name") String name,
                                      @RequestParam(value = "family") String family,
                                      @RequestParam(value = "oth") String oth,
                                      @RequestParam(value = "years") int years,
                                      @RequestParam(value = "sex") String sex,
                                      @RequestParam(value = "mary") Boolean mary,
                                      @RequestParam(value = "date") Date date){

        employeesS.createEmployee(new Employees(name, family,oth,years,sex,mary,date));

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/employee")
    ResponseEntity<Void> deleteEmp(@RequestBody Employees employees){
        employeesS.deleteEmployee(employees);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/employees")
    ResponseEntity<Void> deleteEmps(){
        employeesS.deleteAll();
        return ResponseEntity.ok().build();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
}
