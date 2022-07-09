package com.exemplo.controle.service;

import com.exemplo.controle.repository.UsuarioRepository;
import com.exemplo.controle.service.dto.UsuarioDTO;
import com.exemplo.controle.service.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    
    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioDTO salvar(UsuarioDTO UsuarioDTO) {
        return mapper.toDto(repository.save(mapper.toEntity(UsuarioDTO)));
    }

    public void apagar(String login) {
        repository.deleteById(login);
    }
    
}
