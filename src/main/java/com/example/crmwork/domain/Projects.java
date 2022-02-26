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
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Projects projects = (Projects) o;
        return id != null && Objects.equals(id, projects.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
