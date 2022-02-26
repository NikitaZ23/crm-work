package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class EPC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "id_e")
    UUID id_e;

    @Column(name = "id_p")
    UUID id_p;

    @Column(name = "id_c")
    UUID id_c;

    public EPC(UUID id_e, UUID id_p, UUID id_c) {
        this.id_e = id_e;
        this.id_p = id_p;
        this.id_c = id_c;
    }
}
