package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {

	private int custId;
	private String cusName;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean init method.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cusName=" + cusName + "]";
	}

}
