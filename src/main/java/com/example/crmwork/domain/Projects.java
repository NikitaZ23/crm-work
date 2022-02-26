package com.example.crmwork.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "dedlain")
    Date dedlain;


    @Column(name = "client")
    UUID clients;

    //@OneToMany
    @Column(name = "employees")
    UUID employees;

    public Projects(String name, Date dedlain, UUID clients, UUID employees) {
        this.name = name;
        this.dedlain = dedlain;
        this.clients = clients;
        this.employees = employees;
    }
}
