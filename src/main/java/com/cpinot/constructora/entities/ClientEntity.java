package com.cpinot.constructora.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "client")
public class ClientEntity {
    @Id
    private String rut;
    private String nameProjectClient;
    private Integer completionPercent;
}
