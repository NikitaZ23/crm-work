package com.example.crmwork.repos;

import com.example.crmwork.domain.EPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface EPCRepos extends JpaRepository<EPC, UUID> {
    @Query(value = "select * from epc where id_e = ?1", nativeQuery = true)
    List<EPC> findByIde(UUID id_e);

    @Query(value = "select * from epc where id_p = ?1", nativeQuery = true)
    List<EPC> findByIdp(UUID id_p);

    @Query(value = "select * from epc where id_c = ?1", nativeQuery = true)
    List<EPC> findByIdc(UUID id_c);

    @Query(value = "select * from epc where id_e = ?1 and id_p = ?2", nativeQuery = true)
    EPC findByIds(UUID id_e, UUID id_p);

//    @Query(value = "select s.* from EPC s, products p where s.idp = p.id and p.name = ?1", nativeQuery = true)
//    List<EPC> findAllByNameP(@Param("name") String name);
}
