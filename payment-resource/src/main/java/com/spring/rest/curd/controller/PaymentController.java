package com.spring.rest.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.curd.dto.PaymentResponse;
import com.spring.rest.curd.model.Payment;
import com.spring.rest.curd.service.PaymentServiceImpl;

@RestController
@RequestMapping("/paymentresource")
public class PaymentController {
	
	@Autowired
	private PaymentServiceImpl service;

	@PostMapping("/paynow")
	public PaymentResponse payInstant(@RequestBody Payment payment) {
		return service.pay(payment);
	}
	
	/*@GetMapping("/gettxndetails/{vendor}")
	public PaymentResponse getTransaction(@PathVariable String vendor) {
		return service.getTxn(vendor);
	}*/
	
	

}
