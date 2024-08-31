package br.com.security.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.security.basic.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
