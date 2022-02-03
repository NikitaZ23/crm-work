package com.example.crmwork.controls;

import com.example.crmwork.domain.Clients;
import com.example.crmwork.service.ClientsService;
import com.example.crmwork.service.EPCService;
import com.example.crmwork.service.EmployeesService;
import com.example.crmwork.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/clients")
    List<Clients> getAllAnimals() {
        return clientsS.findAll();
    }

    @PostMapping("/client")
    ResponseEntity<Void> createClient(@RequestBody Clients clients){
        System.out.println(clients.getId());
        clientsS.createClient(clients);
        return ResponseEntity.ok().build();
    }
}
