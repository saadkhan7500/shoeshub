package com.sportsShoes.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Purchase 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
	
	private int productId;
	
	private int userId;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(int id, int productId, int userId) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productId=" + productId + ", userId=" + userId + "]";
	}
	
	
}
