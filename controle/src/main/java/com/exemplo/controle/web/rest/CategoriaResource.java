package com.exemplo.controle.web.rest;

import com.exemplo.controle.service.CategoriaService;
import com.exemplo.controle.service.dto.CategoriaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor
@Validated
public class CategoriaResource {

    private final CategoriaService service;

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        return ResponseEntity.ok(service.listarTodos());
    }


}
