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
public class Tenancy {

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

	@Column(name = "occupied")
	private boolean occupied;

	@ManyToOne
	@JoinColumn(name = "property")
	private Property property;

	@ManyToOne
	@JoinColumn(name = "client")
	private Client client;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getRentPerMonth() {
		return rentPerMonth;
	}

	public void setRentPerMonth(double rentPerMonth) {
		this.rentPerMonth = rentPerMonth;
	}

	public short getTenancyTerm() {
		return tenancyTerm;
	}

	public void setTenancyTerm(short tenancyTerm) {
		this.tenancyTerm = tenancyTerm;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
