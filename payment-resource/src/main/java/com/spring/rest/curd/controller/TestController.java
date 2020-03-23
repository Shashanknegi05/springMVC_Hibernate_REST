package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.rest.curd.model.Payment;

@Controller
@RequestMapping("/testingpage")
public class TestController {
	
	@Autowired
	private Payment payment;
	
	@GetMapping("/test")
	public Payment getDetails() {
		payment.setId(1);
		payment.setAmount(1000);
		payment.setTransactionId("Txn10101");
		payment.setVendor("PhonePe");
		System.out.println("I am inside Test Controller");
		return payment;
	}
	

}
