package com.cpinot.constructora.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table ( name="project")
public class ProjectEntity {
    @Id
    private String id;
    private String nombreProject;
    private String ubicacion;
}
