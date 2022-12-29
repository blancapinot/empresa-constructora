package com.cpinot.constructora.repository;

import com.cpinot.constructora.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<ProjectEntity, String>{
}
