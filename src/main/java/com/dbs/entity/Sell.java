package com.dbs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sell {
	
	@Id
	@Column
	long id;
	
	@ManyToOne(optional = false)
	Client client;
	
	@ManyToOne(optional = false)
	Instrument instrument;
	
	@Column
	double price;
	
	@Column
	int quantity;	
}
