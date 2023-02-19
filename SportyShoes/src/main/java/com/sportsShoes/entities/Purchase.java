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
    
	@OneToOne(targetEntity = Product.class , cascade = CascadeType.ALL)
    private Product productId;
    
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
    private User userId;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(int id, Product productId, User userId) {
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

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productId=" + productId + ", userId=" + userId + "]";
	}

}
