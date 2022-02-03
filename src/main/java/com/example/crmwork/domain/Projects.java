package com.example.crmwork.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
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


    public Projects(String name, Date dedlain, UUID clients) {
        this.name = name;
        this.dedlain = dedlain;
        this.clients = clients;
    }

    public Projects() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDedlain() {
        return dedlain;
    }

    public void setDedlain(Date dedlain) {
        this.dedlain = dedlain;
    }

    public UUID getClients() {
        return clients;
    }

    public void setClients(UUID clients) {
        this.clients = clients;
    }
}
