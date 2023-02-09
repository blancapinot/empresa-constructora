package com.cpinot.constructora.controller;

import com.cpinot.constructora.entities.ProveedorEntity;
import com.cpinot.constructora.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
@Autowired
private ProveedorService proveedorService;

    /**
     * Lista todos los proveedores desde la BD
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(proveedorService.getAll());
    }

    @PostMapping
    public ResponseEntity<ProveedorEntity> create(
            @RequestBody ProveedorEntity proveedor){
        ProveedorEntity result = proveedorService.create(proveedor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ProveedorEntity proveedor){
        return ResponseEntity.ok().body(proveedorService.update(proveedor));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody ProveedorEntity proveedor){
        proveedorService.delete(proveedor);
        return ResponseEntity.ok().build();
    }
}
