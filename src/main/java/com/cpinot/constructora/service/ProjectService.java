package com.cpinot.constructora.service;

import com.cpinot.constructora.entities.ProjectEntity;
import com.cpinot.constructora.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    static
    IProjectRepository projectRepository;
    public static List<ProjectEntity> getAll(){
        return projectRepository.findAll();
    }
    public ProjectEntity create(ProjectEntity project){
        return projectRepository.save(project);
    }
    public static ProjectEntity update(ProjectEntity project){
        return projectRepository.save(project);
    }

    public void delete(ProjectEntity project){
        projectRepository.deleteById(project.getId());
    }

}
