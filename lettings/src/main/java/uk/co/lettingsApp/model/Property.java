package uk.co.lettingsApp.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Property {
	private String name;
	private String postCode;

	public Property(String name, String postCode) {
		super();
		this.name = name;
		this.postCode = postCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
