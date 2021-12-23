package com.dbs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table

public class Client {
	
	@Id
	@Column(name = "id")
	String clientId;
	
	@Column(name = "clientName")
	String clientName;
	
	@ManyToOne(optional = false)
	Custodian custodian;
	
	@Column(name = "price")
	double price;
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String clientId, String clientName, Custodian custodian, double price) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.custodian = custodian;
		this.price = price;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Custodian getCustodian() {
		return custodian;
	}

	public void setCustodian(Custodian custodian) {
		this.custodian = custodian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", custodian=" + custodian + ", price="
				+ price + "]";
	}
	
	
}
