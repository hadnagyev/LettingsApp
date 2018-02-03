package uk.co.lettingsApp.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.co.lettingsApp.model.Client;
import uk.co.lettingsApp.service.ClientService;

@RestController
@RequestMapping(value = "api/clients")
public class ApiClientController {
	@Autowired
	private ClientService clientService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Client>> getClients() {
		List<Client> clients = clientService.findAll();
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClientById(Long id) {
		Client client = clientService.findOne(id);
		System.out.println(client.getName());
		return new ResponseEntity<>(client, HttpStatus.OK);
	}

}
