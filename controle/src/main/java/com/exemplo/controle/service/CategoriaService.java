package com.exemplo.controle.service;

import com.exemplo.controle.repository.CategoriaRepository;
import com.exemplo.controle.service.dto.CategoriaDTO;
import com.exemplo.controle.service.mapper.CategoriaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository repository;
    private final CategoriaMapper mapper;

    public List<CategoriaDTO> listarTodos() {
        return mapper.toDto(repository.findAll());
    }

}
