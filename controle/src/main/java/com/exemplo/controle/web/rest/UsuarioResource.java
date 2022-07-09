package com.exemplo.controle.web.rest;

import com.exemplo.controle.service.UsuarioService;
import com.exemplo.controle.service.dto.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioResource {
    
    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO UsuarioDTO) {
        return new ResponseEntity<>(service.salvar(UsuarioDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{login}")
    public ResponseEntity<Void> delete(@PathVariable String login) {
        service.apagar(login);
        return ResponseEntity.ok().build();
    }
    
}
