package com.cjc.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	private int cid;

	private String cname;

	private String address;
	private int pincode;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> prodList;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String address, List<Product> prodList) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.prodList = prodList;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Product> getProdList() {
		return prodList;
	}

	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}

}
