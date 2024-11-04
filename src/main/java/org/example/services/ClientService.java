package org.example.services;

import org.example.intefaces.AppHelper;
import org.example.intefaces.Service;
import org.example.Client;
import org.example.intefaces.Repository;

import java.util.List;
public class ClientService implements Service {
    private final Repository<Client> repository;
    private AppHelper<Client> appHelperClient;

    public ClientService(AppHelper<Client> appHelperClient, Repository<Client> repository) {
        this.repository = repository;
        this.appHelperClient = appHelperClient;
    }

    public boolean add() {
        Client client = appHelperClient.create();
        if(client == null) return false; {
            try {
                repository.save(client);
                return true;
        }catch (Exception e){
                return false;
            }

        public boolean print() {
                return appHelperClient.printList(repository.load());
            }
        @Override
        public List list() {
                return repository.load();
            }
    }
}
