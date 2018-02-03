package uk.co.lettingsApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import uk.co.lettingsApp.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findAll();

}


