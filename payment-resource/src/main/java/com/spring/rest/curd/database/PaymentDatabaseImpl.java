package com.spring.rest.curd.database;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.spring.rest.curd.model.Payment;

public class PaymentDatabaseImpl implements PaymentDatabase {

	private List<Payment> paymentData = new LinkedList<Payment>();
	public void save(Payment payment) {
		paymentData.add(payment);
		System.out.println("added into List");
		new PaymentDatabaseImpl().print();
	}

	public void print() {
		paymentData.forEach((temp) -> System.out.println(temp));
	}
	
	public String getTransaction(String vendor) {
		ArrayList<Integer> vendorTxn = new ArrayList<Integer>();
		
		/*ListIterator itr = paymentData.listIterator();
		
		while(itr.hasNext()) {
			if(==vendor)
				vendorTxn.add(paymentData.)
		}*/
		
		return "In Progress";
	}
	
}
