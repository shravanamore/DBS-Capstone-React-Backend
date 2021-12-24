package com.dbs.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.dao.RequestRepository;
import com.dbs.entity.Client;
import com.dbs.entity.Instrument;
import com.dbs.entity.Request;
import com.dbs.exception.InvalidClientException;
import com.dbs.exception.InvalidInstrumentException;
import com.dbs.model.OrderDirection;
import com.dbs.model.OrderRequest;
import com.dbs.model.OrderStatus;

@Service
public class RequestService {
	
	@Autowired
	ClientService clientService;
	@Autowired
	InstrumentService instrumentService;
	@Autowired
	RequestRepository requestRepository;
	
	public void processTransaction(OrderRequest orderRequest) throws InvalidClientException, InvalidInstrumentException {
		
		if(orderRequest.getOrderDirection().equals(OrderDirection.BUY)) {
			this.buyOrder(orderRequest);
		}
		if(orderRequest.getOrderDirection().equals(OrderDirection.SELL)) {
			this.sellOrder(orderRequest);
		}
	}

	private Object buyOrder(OrderRequest buyerOrderRequest) throws InvalidClientException, InvalidInstrumentException {
		Instrument buyerInstrument = instrumentService.findById(buyerOrderRequest.getInstrumentId());              
        Client buyer = clientService.findById(buyerOrderRequest.getClientId());
        
        Request order = new Request(buyer, buyerInstrument, 
        						buyerOrderRequest.getPrice(),
        						buyerOrderRequest.getQuantity(),
        						OrderStatus.PROCESSING,
        						OrderDirection.BUY,
        						new Date());
//        requestRepository.save(order);
        
        
        
		return null;
	}
	
	private Object sellOrder(OrderRequest orderRequest) {
		
		// TODO Auto-generated method stub
		return null;
	}

	

}
