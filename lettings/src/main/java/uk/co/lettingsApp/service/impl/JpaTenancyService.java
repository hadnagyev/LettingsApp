package uk.co.lettingsApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.co.lettingsApp.model.Tenancy;
import uk.co.lettingsApp.repository.TenancyRepository;
import uk.co.lettingsApp.service.TenancyService;

@Transactional
@Service
public class JpaTenancyService implements TenancyService {
	@Autowired
	private TenancyRepository tenancyRepository;

	@Override
	public List<Tenancy> findAll() {
		return tenancyRepository.findAll();
	}

}
