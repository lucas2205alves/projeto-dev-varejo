package com.lucasalves.projeto_dev_varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasalves.projeto_dev_varejo.entity.Usuario;
import com.lucasalves.projeto_dev_varejo.repository.UsuarioRepository;

@Service
public class UsuarioService {
    	
	@Autowired
	private UsuarioRepository usuarioRepository;

    public String save (Usuario usuario) {
		this.usuarioRepository.save(usuario);
		return "Usuário cadastrado com sucesso";
	}

    public List<Usuario> listar () {
		
		return this.usuarioRepository.findAll();
		
	}
    

}
