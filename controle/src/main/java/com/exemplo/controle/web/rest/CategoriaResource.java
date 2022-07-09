package com.exemplo.controle.web.rest;

import com.exemplo.controle.service.CategoriaService;
import com.exemplo.controle.service.dto.CategoriaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor
@Validated
public class CategoriaResource {

    private final CategoriaService service;

    @PostMapping
    public ResponseEntity<CategoriaDTO> salvar(@RequestBody CategoriaDTO categoriaDTO) {
        return new ResponseEntity<>(service.salvar(categoriaDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> delete(@PathVariable Long codigo) {
        service.apagar(codigo);
        return ResponseEntity.ok().build();
    }

}
