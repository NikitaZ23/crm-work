package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
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

    public Clients(String name, String family, String oth, int year, String sex) {
        this.name = name;
        this.family = family;
        this.oth = oth;
        this.year = String.valueOf(year);
        this.sex = sex.toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Clients clients = (Clients) o;
        return id != null && Objects.equals(id, clients.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
