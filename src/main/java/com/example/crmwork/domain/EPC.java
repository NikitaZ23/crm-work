package com.example.crmwork.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EPC epc = (EPC) o;
        return id != null && Objects.equals(id, epc.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
