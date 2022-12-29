package com.cpinot.constructora.service;

import com.cpinot.constructora.entities.ProjectEntity;
import com.cpinot.constructora.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    IProjectRepository projectRepository;
    public List<ProjectEntity> getAll(){
        return projectRepository.findAll();

    }
}
