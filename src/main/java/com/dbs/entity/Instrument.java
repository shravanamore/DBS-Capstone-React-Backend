package com.dbs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instrument {
	
	@Id
	@Column
	String instrumentId;
	
	@Column
	String instrumentName;
	
	@Column
	int faceValue;
	
	@Column
	double price;
	
	@Column
	Date expiryDate;
	
}
