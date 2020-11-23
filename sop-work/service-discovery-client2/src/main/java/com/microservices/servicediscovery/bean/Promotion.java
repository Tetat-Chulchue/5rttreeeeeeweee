package com.microservices.servicediscovery.bean;

import java.util.Date;

public class Promotion {
	String name, method, type, description;
	Date expDate;
	int amount, min, max;

	public Promotion() {
		this.name = null;
		this.method = null;
		this.type = null;
		this.description = null;
		this.expDate = null;
		this.amount = 0;
		this.min = 0;
		this.max = 0;
	}
	
	public Promotion(String name, String method, String type, String description, Date expDate, int amount, int min,
			int max) {
		super();
		this.name = name;
		this.method = method;
		this.type = type;
		this.description = description;
		this.expDate = expDate;
		this.amount = amount;
		this.min = min;
		this.max = max;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
