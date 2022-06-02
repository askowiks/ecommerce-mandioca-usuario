package com.letscode.santander.ecommercemandioca.repository;

import com.letscode.santander.ecommercemandioca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
