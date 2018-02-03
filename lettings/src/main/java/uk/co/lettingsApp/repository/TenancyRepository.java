package uk.co.lettingsApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.lettingsApp.model.Tenancy;

public interface TenancyRepository extends JpaRepository<Tenancy, Long> {
	List<Tenancy> findAll();
}
