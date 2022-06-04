package tk.miflotita.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.miflotita.app.services.UsuarioServiceI;

@RestController
public class UsuarioController {
	
	@Autowired //busca un objeto del tipo UsuarioServiceI y lo pone en "service", un singleton, lo enlaza de forma automatica
	private UsuarioServiceI service;
	
	@GetMapping("/saludame")
	public String saluda() {
		return service.saluda();
	}
}
