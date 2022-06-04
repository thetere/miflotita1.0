package tk.miflotita.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tk.miflotita.app.model.Usuario;
import tk.miflotita.app.repositories.UsuarioRepository;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner loadUsuarios(UsuarioRepository repository) {
		return (args) -> {
			Usuario uno = new Usuario();
			uno.setUsername("uno");			
			uno.setEmail("uno@uno.com");
			uno.setPassword("123");
			repository.save(uno);
			
			Usuario dos = new Usuario();
			dos.setUsername("dos");			
			dos.setEmail("dos@dos.com");
			dos.setPassword("123");
			repository.save(dos);			
		};
	}

}
