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
    ProjectsRepos projectsRepos;

    @Autowired
    EPCService epcService;

    public ProjectsService(ProjectsRepos repos) {
        this.projectsRepos = repos;
    }

    public void createPr(Projects projects){
        projectsRepos.save(projects);
    }

    public void deletePr(Projects projects){
        epcService.findByIDP(projects.getId()).forEach(epc -> epcService.deleteEPC(epc));
        projectsRepos.delete(projects);
    }

    public void deleteAll(){
        epcService.deleteAll();
        projectsRepos.deleteAll();
    }

    public List<Projects> findAll(){
        return projectsRepos.findAll();
    }

    public Projects findById(UUID id){
        return projectsRepos.findById(id).orElse(null);
    }
}
