package uk.co.lettingsApp.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblProperty")
public class Property {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "postCode")
	private String postCode;
	
	@ManyToOne
	@JoinColumn(name = "client")
	private Client client;

	@OneToMany(mappedBy = "property")
	private Set<Tenancy> tenancies;

}
