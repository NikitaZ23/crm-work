package com.example.crmwork.repos;

import com.example.crmwork.domain.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientsRepos extends JpaRepository<Clients, UUID> {
}
