package com.spring.rest.curd.dao;

import com.spring.rest.curd.model.Payment;

public interface PaymentDao {

	String payNow(Payment payment);
}