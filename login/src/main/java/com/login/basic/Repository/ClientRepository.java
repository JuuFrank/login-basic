package com.login.basic.Repository;



import com.login.basic.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByCorreo(String correo);
}
