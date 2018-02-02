package uk.co.lettingsApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblTenancy")
public class Tenancy extends Property {

	public Tenancy(String name, String postCode) {
		super(name, postCode);
	}

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "address")
	private String address;

	@Column(name = "rent_per_month")
	private double rentPerMonth;

	@Column(name = "tenancy_term")
	private short tenancyTerm;

	@Column(name = "status")
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "client")
	private Client client;
}
