package com.dev.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users_info_jpa")
public class User1 {

	@Id @Column(name="person_id")
	private int id;

	private String name;

	private int age;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addr_id", referencedColumnName="addrs_id")
	private Address2 address;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="product_id")
	List<Products> product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	public List<Products> getProduct() {
		return product;
	}

	public void setProduct(List<Products> product) {
		this.product = product;
	}

	

}