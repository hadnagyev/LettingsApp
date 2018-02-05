package uk.co.lettingsApp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.co.lettingsApp.model.Client;
import uk.co.lettingsApp.repository.ClientRepository;
import uk.co.lettingsApp.service.ClientService;

@Transactional
@Service
public class JpaClientService implements ClientService {
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findOne(Long id) {
		return clientRepository.findOne(id);
	}

	@Override
	public List<Object[]> propertySumPerClient() {
		return clientRepository.propertySumPerClient();
	}
}
