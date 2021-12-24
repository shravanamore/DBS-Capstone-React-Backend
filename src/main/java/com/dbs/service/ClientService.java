package com.dbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dbs.dao.ClientRepository;
import com.dbs.entity.Client;
import com.dbs.exception.InvalidClientException;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	public Client findById(String id) throws InvalidClientException {
		Optional<Client> client = clientRepository.findById(id);
        if(!client.isPresent()) {
            throw new InvalidClientException("Client not found with id - " + id);
        }
        return client.get();
	}

}
