package com.exemplo.controle.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "categoria")
@Entity
@Getter
@Setter
public class Categoria implements Serializable {

    @Id
    private Long codigo;

    private String nome;

}
