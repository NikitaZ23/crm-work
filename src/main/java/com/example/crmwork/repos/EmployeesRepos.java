package com.example.crmwork.repos;

import com.example.crmwork.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeesRepos extends JpaRepository<Employees, UUID> {
}
