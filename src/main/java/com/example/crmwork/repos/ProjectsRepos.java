package com.example.crmwork.repos;

import com.example.crmwork.domain.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectsRepos extends JpaRepository<Projects, UUID> {
}
