package com.cjc.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	private int pid;

	private String pname;

	private String color;

	private double price;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Customer> custList;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, String color, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Customer> getCustList() {
		return custList;
	}

	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	}

}
