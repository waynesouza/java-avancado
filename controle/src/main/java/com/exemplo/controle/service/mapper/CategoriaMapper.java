package com.exemplo.controle.service.mapper;

import com.exemplo.controle.domain.Categoria;
import com.exemplo.controle.service.dto.CategoriaDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    Categoria toEntity(CategoriaDTO categoriaDTO);

    CategoriaDTO toDto(Categoria categoria);

    List<CategoriaDTO> toDto(List<Categoria> categoria);

}
