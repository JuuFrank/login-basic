package login.basic.customer.domain.persistence;

import login.basic.customer.domain.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByCorreo(String correo);
}
