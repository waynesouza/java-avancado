package com.exemplo.controle.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class DespesaDTO implements Serializable {

    private Long codigo;

    @NotNull
    private UsuarioDTO usuarioDTO;

    @NotNull
    private CategoriaDTO categoriaDTO;

    @NotNull
    private LocalDateTime data;

    @NotNull
    private Double valor;

}
