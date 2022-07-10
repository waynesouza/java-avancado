package com.exemplo.controle.repository;

import com.exemplo.controle.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, String> {

    Usuario findUsuarioByLogin(String login);
}
