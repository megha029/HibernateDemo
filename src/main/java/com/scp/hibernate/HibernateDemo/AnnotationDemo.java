package com.scp.hibernate.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Stock1")
public class AnnotationDemo {
	

	@Id
	@Column(name="IDNO")
	private int id;
	
	@Column(name="Product_name")
	private String name;
	
	@Column(name="Product_price")
	private int price;

	public AnnotationDemo(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AnnotationDemo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
