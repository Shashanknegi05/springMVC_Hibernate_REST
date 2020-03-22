package com.spring.rest.curd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.rest.curd.database.PaymentDatabase;
import com.spring.rest.curd.model.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	private PaymentDatabase paymentData;
	
	
	public String payNow(Payment payment) {
		paymentData.save(payment);
		return "Payment successful with amount: "+payment.getAmount();
	}
	
	
	
	

}
