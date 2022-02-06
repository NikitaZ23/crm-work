package com.example.crmwork.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
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

    public UUID getId_e() {
        return id_e;
    }

    public void setId_e(UUID id_e) {
        this.id_e = id_e;
    }

    public UUID getId_c() {
        return id_c;
    }

    public void setId_c(UUID id_c) {
        this.id_c = id_c;
    }

    public UUID getId_p() {
        return id_p;
    }

    public void setId_p(UUID id_p) {
        this.id_p = id_p;
    }
}
