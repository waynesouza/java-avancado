package com.exemplo.controle.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "despesa")
@Entity
@Getter
@Setter
public class Despesa implements Serializable {

    @Id
    private Long codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario", referencedColumnName = "login", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria", referencedColumnName = "codigo", nullable = false)
    private Categoria categoria;

    private LocalDateTime data;

    private Double valor;
}
