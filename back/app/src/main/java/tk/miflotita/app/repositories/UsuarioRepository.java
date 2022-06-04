package tk.miflotita.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.miflotita.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
