package uk.co.lettingsApp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uk.co.lettingsApp.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findAll();

	@Query(value = "SELECT tbl_client.id,tbl_client.name, SUM(rent_per_month) FROM tbl_tenancy INNER JOIN tbl_client ON tbl_tenancy.client=tbl_client.id group by client", nativeQuery = true)
	List<Object[]> propertySumPerClient();
}
