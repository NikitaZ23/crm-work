package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    String name;

    @Column(name = "family")
    String family;

    @Column(name = "oth")
    String oth;

    @Column(name = "year")
    int year;

    @Column(name = "sex")
    String sex;

    @Column(name = "mary")
    Boolean mary;

    @Column(name = "date")
    Date date;

    public Employees(String name, String family, String oth, int year, String sex, Boolean mary, Date date) {
        this.name = name;
        this.family = family;
        this.oth = oth;
        this.year = year;
        this.sex = sex;
        this.mary = mary;
        this.date = date;
    }
}
