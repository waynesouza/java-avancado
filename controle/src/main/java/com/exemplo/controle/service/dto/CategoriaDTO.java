package com.exemplo.controle.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class CategoriaDTO implements Serializable {

    private Long codigo;

    @NotNull
    private String nome;

}
