package com.api.api_user.domain.repository;
import com.api.api_user.domain.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    @Query("SELECT c FROM Cliente c WHERE c.login = ?1 AND c.senha = ?2")
    Cliente findByLoginAndSenha(String login, String senha);
}
