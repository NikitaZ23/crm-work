package com.example.crmwork.service;

import com.example.crmwork.domain.Projects;
import com.example.crmwork.repos.ProjectsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjectsService {
    @Autowired
    ProjectsRepos repos;

    public ProjectsService(ProjectsRepos repos) {
        this.repos = repos;
    }

    public void createPr(Projects projects){
        repos.save(projects);
    }

    public void deletePr(Projects projects){
        repos.delete(projects);
    }

    public void deleteAll(){
        repos.deleteAll();
    }

    public List<Projects> findAll(){
        return repos.findAll();
    }

    public Projects findById(UUID id){
        return repos.findById(id).orElse(null);
    }
}
