package com.spring.rest.curd.database;

import com.spring.rest.curd.model.Payment;

public interface PaymentDatabase {
	
	void save(Payment payment);
	void print();

}