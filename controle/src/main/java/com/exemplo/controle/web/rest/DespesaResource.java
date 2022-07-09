package com.exemplo.controle.web.rest;

import com.exemplo.controle.service.DespesaService;
import com.exemplo.controle.service.dto.DespesaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/despesa")
@RequiredArgsConstructor
@Validated
public class DespesaResource {

    private final DespesaService service;

    @PostMapping
    public ResponseEntity<DespesaDTO> salvar(@RequestBody DespesaDTO DespesaDTO) {
        return new ResponseEntity<>(service.salvar(DespesaDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DespesaDTO>> findAll() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> delete(@PathVariable Long codigo) {
        service.apagar(codigo);
        return ResponseEntity.ok().build();
    }
    
}
