package tk.miflotita.app.services.impl;

import org.springframework.stereotype.Service;

import tk.miflotita.app.services.UsuarioServiceI;

@Service //para que lo pueda inyectar... con autowired?
class UsuarioServiceImpl implements UsuarioServiceI {
	
	public String saluda() {
		return "¡Hola humane! Te saludo.";
	}

}
