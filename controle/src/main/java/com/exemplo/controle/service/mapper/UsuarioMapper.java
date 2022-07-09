package com.exemplo.controle.service.mapper;

import com.exemplo.controle.domain.Usuario;
import com.exemplo.controle.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO UsuarioDTO);

    UsuarioDTO toDto(Usuario Usuario);

    List<UsuarioDTO> toDto(List<Usuario> Usuario);
    
}
