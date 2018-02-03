package uk.co.lettingsApp.service;

import java.util.List;
import uk.co.lettingsApp.model.Client;

public interface ClientService {
	List<Client> findAll();
	Client findOne(Long id);
}
