package com.example.crmwork.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Locale;
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
    Integer year;

    @Column(name = "sex")
    String sex;

    public Clients(String name, String family, String oth, Integer year, String sex) {
        this.name = name;
        this.family = family;
        this.oth = oth;
        this.year = year;
        this.sex = sex.toLowerCase(Locale.ROOT);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
