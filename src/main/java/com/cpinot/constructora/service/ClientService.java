package com.cpinot.constructora.service;

import com.cpinot.constructora.entities.ClientEntity;
import com.cpinot.constructora.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {

    @Autowired
    static
    IClientRepository clientRepository;
        public static List<ClientEntity> getAll(){
            return clientRepository.findAll();
        }
        public ClientEntity create(ClientEntity client){
            return clientRepository.save(client);
        }
        public static ClientEntity update(ClientEntity client){
            return clientRepository.save(client);
        }

        public void delete(ClientEntity client){clientRepository.deleteById(client.getRut());
        }

    }

