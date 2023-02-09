package com.cpinot.constructora.controller;

import com.cpinot.constructora.entities.ClientEntity;
import com.cpinot.constructora.entities.ProveedorEntity;
import com.cpinot.constructora.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
/*//    Lista todos los clientes desde la BD*/
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(clientService.getAll());
    }
    /*//  Crea un nuevo cliente y lo agrega a la BD*/

    @PostMapping
    public ResponseEntity<ClientEntity> create(
            @RequestBody ClientEntity client){
        ClientEntity result = clientService.create(client);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /*//  Actualiza un cliente en la BD*/
    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody ClientEntity client){
        return ResponseEntity.ok().body(clientService.update(client));
    }

    /*//  Elimina un cliente en la BD*/
    @DeleteMapping
    public ResponseEntity<?> delete(
            @RequestBody ClientEntity client){
        clientService.delete(client);
        return ResponseEntity.ok().build();

    }

}
