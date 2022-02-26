package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOth() {
        return oth;
    }

    public void setOth(String oth) {
        this.oth = oth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getMary() {
        return mary;
    }

    public void setMary(Boolean mary) {
        this.mary = mary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
