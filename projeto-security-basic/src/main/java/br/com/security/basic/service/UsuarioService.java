package br.com.security.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.security.basic.model.Usuario;
import br.com.security.basic.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario consultarUsuarioPorId(Long id) {		
		return usuarioRepository.findById(id).get(); 
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
