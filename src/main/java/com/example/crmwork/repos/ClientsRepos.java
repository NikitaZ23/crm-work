package com.example.crmwork.repos;

import com.example.crmwork.domain.Clients;
import com.example.crmwork.domain.EPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ClientsRepos extends JpaRepository<Clients, UUID> {
    @Query(value = "select * from clients where name = ?1", nativeQuery = true)
    List<Clients> findByName(String name);
}
