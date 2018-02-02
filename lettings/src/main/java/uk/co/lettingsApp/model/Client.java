package uk.co.lettingsApp.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblClient")
public class Client {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy="client")
	private List<Property> properties;

}
