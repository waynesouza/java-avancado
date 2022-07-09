package com.exemplo.controle.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "usuario")
@Entity
@Getter
@Setter
public class Usuario implements Serializable {

    @Id
    private String login;

    private String senha;

    private String nome;

}
