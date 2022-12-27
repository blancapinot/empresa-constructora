package com.cpinot.constructora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Controller
@RequestMapping("/project")
public class ProjectController {

    /**
     * Lista todos los proyectos desde la BD
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body("listado de proyectos");
    }

    @PostMapping
    public ResponseEntity<?> create() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<?> update() {
        return ResponseEntity.ok().body("Se actualizo el proyecto");
    }

    @DeleteMapping
    public ResponseEntity<?> delete() {
        return ResponseEntity.ok().body("Se elimino el proyecto");
    }
}
