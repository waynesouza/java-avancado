package com.exemplo.controle.service;

import com.exemplo.controle.repository.DespesaRepository;
import com.exemplo.controle.service.dto.DespesaDTO;
import com.exemplo.controle.service.mapper.DespesaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DespesaService {
    
    private final DespesaRepository repository;
    private final DespesaMapper mapper;

    public DespesaDTO salvar(DespesaDTO DespesaDTO) {
        return mapper.toDto(repository.save(mapper.toEntity(DespesaDTO)));
    }

    public List<DespesaDTO> listarTodos() {
        return mapper.toDto(repository.findAll());
    }

    public void apagar(Long codigo) {
        repository.deleteById(codigo);
    }
    
}
