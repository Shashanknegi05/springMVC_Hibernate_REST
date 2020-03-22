package com.spring.rest.curd.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.curd.dao.PaymentDao;
import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDao dao;
	
	public PaymentResponse pay(Payment payment) {
		PaymentResponse response = new PaymentResponse();
		String message = dao.payNow(payment);
		response.setStatus("success");
		response.setMessage(message);
		response.setTxnDate(new SimpleDateFormat("DD/MM/YYYY HH:MM:SS a").format(new Date()));
		return response;
	}

	/*public PaymentResponse getTxn(String vendor) {
		PaymentResponse response = new PaymentResponse();
		List<Payment> payment
		return null;
	}*/

}
