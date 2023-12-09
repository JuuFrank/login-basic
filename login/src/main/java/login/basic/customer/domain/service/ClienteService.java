package login.basic.customer.domain.service;

import login.basic.customer.domain.model.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    Client saveClient(Client client);

    Client findByCorreo(String correo);

    List<Client> getAllUsers();

    List<Client> getAllClients();

    Client getClientById(Integer clientId);
}
