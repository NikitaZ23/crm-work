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
    ClientsRepos clRepos;

    @Autowired
    EPCService epcService;

    public ClientsService(ClientsRepos repos) {
        this.clRepos = repos;
    }

    public void createClient(Clients clients){
        clRepos.save(clients);
    }

    public void deleteClient(Clients clients){
        epcService.findByIDC(clients.getId()).forEach(epc -> epcService.deleteEPC(epc));
        clRepos.delete(clients);
    }

    public void deleteClients(){
        clRepos.findAll().forEach(clients -> epcService.findByIDC(clients.getId()).forEach(epc -> epcService.deleteEPC(epc)));
        clRepos.deleteAll();
    }

    public List<Clients> findAll(){
        return clRepos.findAll();
    }

    public Clients findByID(UUID uid){
        return clRepos.findById(uid).orElse(null);
    }
}
