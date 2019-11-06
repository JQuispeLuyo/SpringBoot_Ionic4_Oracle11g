package com.josequispe.cropy.repository;

import com.josequispe.cropy.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

}