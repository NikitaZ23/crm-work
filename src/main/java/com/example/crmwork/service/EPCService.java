package com.example.crmwork.service;

import com.example.crmwork.domain.EPC;
import com.example.crmwork.repos.EPCRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EPCService {
    @Autowired
    EPCRepos repos;

    public EPCService(EPCRepos repos) {
        this.repos = repos;
    }

    public void createEPC(EPC epc){
        repos.save(epc);
    }

    public void deleteAll(){
        repos.deleteAll();
    }

    public EPC findByID(UUID id){
        return repos.findById(id).orElse(null);
    }

    public List<EPC> findByIDP(UUID id_p){
        return repos.findByIdp(id_p);
    }

    public List<EPC> findByIDE(UUID id_e){
        return repos.findByIde(id_e);
    }

    public List<EPC> findAll(){
        return repos.findAll();
    }
}
