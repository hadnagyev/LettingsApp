package uk.co.lettingsApp.web.dto;

public class ClientDTO {
	private Long id;
	private String name;
	private Double sumOfTenancyRents;

	public ClientDTO(Long id, String name, Double sumOfTenancyRents) {
		super();
		this.id = id;
		this.name = name;
		this.sumOfTenancyRents = sumOfTenancyRents;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSumOfTenancyRents() {
		return sumOfTenancyRents;
	}

	public void setSumOfTenancyRents(Double sumOfTenancyRents) {
		this.sumOfTenancyRents = sumOfTenancyRents;
	}

}
