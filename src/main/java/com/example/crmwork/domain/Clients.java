package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

@Entity
@NoArgsConstructor
public class Clients {
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
    String year;

    @Column(name = "sex")
    String sex;

    public Clients(String name, String family, String oth, String year, String sex) {
        this.name = name;
        this.family = family;
        this.oth = oth;
        this.year = year;
        this.sex = sex;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
