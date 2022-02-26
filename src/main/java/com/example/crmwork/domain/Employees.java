package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@AllArgsConstructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Employees employees = (Employees) o;
        return id != null && Objects.equals(id, employees.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
