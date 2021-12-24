package com.dbs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public class Stock {
	
	@Id
	@Column
	long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "buyer_id")
	Request buyer;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "seller_id")
	Request seller;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "instrument_id")
	Instrument instrument;
		
	@Column
	double price;
	
	@Column
	int quantity;
	
	@Temporal(TemporalType.TIMESTAMP)
    Date timeStamp;

	public Stock(Request buyer, Request seller, Instrument instrument, double price, int quantity,
			Date timeStamp) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.instrument = instrument;
		this.price = price;
		this.quantity = quantity;
		this.timeStamp = timeStamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Request getBuyer() {
		return buyer;
	}

	public void setBuyer(Request buyer) {
		this.buyer = buyer;
	}

	public Request getSeller() {
		return seller;
	}

	public void setSeller(Request seller) {
		this.seller = seller;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", buyer=" + buyer + ", seller=" + seller + ", instrument=" + instrument + ", price="
				+ price + ", quantity=" + quantity + ", timeStamp=" + timeStamp + "]";
	}	
}
