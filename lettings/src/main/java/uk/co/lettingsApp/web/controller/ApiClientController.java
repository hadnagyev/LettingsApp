package uk.co.lettingsApp.web.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.co.lettingsApp.model.Client;
import uk.co.lettingsApp.service.ClientService;
import uk.co.lettingsApp.web.dto.ClientDTO;

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
	//still not in use, not sure if needed at all
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClientById(Long id) {
		Client client = clientService.findOne(id);
		System.out.println(client.getName());
		return new ResponseEntity<>(client, HttpStatus.OK);
	}

	@RequestMapping(value = "/getMonthlyPerClient", method = RequestMethod.GET)
	public ResponseEntity<List<ClientDTO>> getCostsPerClient() {
		// get all clients with sum of all the rents on their properties
		List<Object[]> ret = clientService.propertySumPerClient();

		List<ClientDTO> response = new ArrayList<ClientDTO>();
		// go through all objects from database response and convert them to DTO version
		for (int i = 0; i < ret.size(); i++) {
			Object[] arr = ret.get(i);
			// bigInteger got from database converted to long
			// hard coded, not ideal for later changes
			ClientDTO client = new ClientDTO(((BigInteger) arr[0]).longValue(), (String) arr[1], (Double) arr[2]);
			response.add(client);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
