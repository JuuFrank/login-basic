package com.login.basic.serviceimpl;



import com.login.basic.Repository.ClientRepository;
import com.login.basic.entities.Client;
import com.login.basic.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ClienteServiceImpl implements ClienteService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClienteServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findByCorreo(String correo) {
        return clientRepository.findByCorreo(correo);
    }

    @Override
    public List<Client> getAllUsers() {
        List<Client> clients = clientRepository.findAll();
        // Inicializar la colección users antes de devolver la lista
        return clients;
    }
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    @Override
    public Client getClientById(Integer clientId) {
        // Lógica para obtener un cliente por ID desde la base de datos
        // Puedes usar el repository u otros métodos según tu implementación
        return clientRepository.findById(clientId).orElse(null);
    }

}
