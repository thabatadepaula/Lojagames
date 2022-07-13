package com.generation.GamesJoe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.GamesJoe.Service.UsuarioService;
import com.generation.GamesJoe.model.UserLogin;
import com.generation.GamesJoe.model.Usuario;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

		@Autowired
		private UsuarioService usuarioService;
		
		@PostMapping("/logar")
		public ResponseEntity<UserLogin> Authentication(@RequestBody Optional<UserLogin> user){
			return usuarioService.logarUsuario(user).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
		}
		@PostMapping("/cadastrar")
		public ResponseEntity<Optional<Usuario>> Post(@RequestBody Usuario usuario){
			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuario(usuario));
		}
}
