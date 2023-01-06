package com.cpinot.constructora.controller;

import com.cpinot.constructora.entities.ProjectEntity;
import com.cpinot.constructora.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@Controller
@RequestMapping("/project")
public class ProjectController {

   @Autowired
   private ProjectService projectService;

    /**
     * Lista todos los proyectos desde la BD
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(projectService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProjectEntity project) {
        ProjectEntity result = projectService.create(project);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ProjectEntity project) {
        return ResponseEntity.ok().body(projectService.update(project));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody ProjectEntity project) {
        projectService.delete(project);
        return ResponseEntity.ok().build();
    }
}
