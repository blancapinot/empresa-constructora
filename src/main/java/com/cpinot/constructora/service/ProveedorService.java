package com.cpinot.constructora.service;

import com.cpinot.constructora.entities.ProveedorEntity;
import com.cpinot.constructora.repository.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private IProveedorRepository proveedorRepository;

        public List<ProveedorEntity> getAll(){
            return proveedorRepository.findAll();
        }

        public ProveedorEntity create(ProveedorEntity proveedor){

            return proveedorRepository.save(proveedor);
        }

        public ProveedorEntity update(ProveedorEntity proveedor){

            return proveedorRepository.save(proveedor);
        }

        public void delete(ProveedorEntity proveedor){
                 proveedorRepository.deleteById(proveedor.getRut());
        }
}