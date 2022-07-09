package com.exemplo.controle.service.mapper;

import com.exemplo.controle.domain.Despesa;
import com.exemplo.controle.service.dto.DespesaDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface DespesaMapper {

    Despesa toEntity(DespesaDTO DespesaDTO);

    DespesaDTO toDto(Despesa Despesa);

    List<DespesaDTO> toDto(List<Despesa> Despesa);
    
}
