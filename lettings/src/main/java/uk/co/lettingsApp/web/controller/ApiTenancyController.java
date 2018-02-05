package uk.co.lettingsApp.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.co.lettingsApp.model.Tenancy;
import uk.co.lettingsApp.service.TenancyService;

@RestController
@RequestMapping(value = "api/tenancies")
public class ApiTenancyController {
	@Autowired
	private TenancyService tenancyService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Tenancy>> getTenancies() {
		List<Tenancy> tenancies = tenancyService.findAll();
		return new ResponseEntity<>(tenancies, HttpStatus.OK);
	}
}
