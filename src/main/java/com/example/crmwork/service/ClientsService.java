package com.example.crmwork.service;

import com.example.crmwork.domain.Clients;
import com.example.crmwork.repos.ClientsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientsService {

    @Autowired
    ClientsRepos repos;

    public ClientsService(ClientsRepos repos) {
        this.repos = repos;
    }

    public void createClient(Clients clients){
        repos.save(clients);
    }

    public void deleteClient(Clients clients){
        repos.delete(clients);
    }

    public void deleteClients(){
        repos.deleteAll();
    }

    public List<Clients> findAll(){
        return repos.findAll();
    }

    public Clients findByID(UUID uid){
        return repos.findById(uid).orElse(null);
    }
}
