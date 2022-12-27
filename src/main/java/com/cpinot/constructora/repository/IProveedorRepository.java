package com.cpinot.constructora.repository;

import com.cpinot.constructora.entities.ProveedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorRepository extends JpaRepository<ProveedorEntity, String> {

}
