package com.spring.rest.curd.model;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6713625045316143796L;
	private int id;
	private String transactionId;
	private String vendor;
	//private Date date;
	private double amount;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int id, String transactionId, String vendor, double amount) {
		super();
		this.id = id;
		this.transactionId = transactionId;
		this.vendor = vendor;
		//this.date = date;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

		public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
