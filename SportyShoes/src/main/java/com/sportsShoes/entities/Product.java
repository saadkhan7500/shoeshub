package com.sportsShoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message="name shouldn't be blank")
	private String name;
	
	@NotBlank(message="brand shouldn't be blank")
	private String brand;
	
	@NotBlank(message="category shouldn't be blank")
	private String category;
	
	@NotBlank(message="price shouldn't be blank")
	private String price;
	
	@NotBlank(message="quantity shouldn't be blank")
	private String quantity;
	
	@NotBlank(message="size shouldn't be blank")
	private String size;
	
	private int discount;
	private String status;
	private String imgname;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String brand, String category, String price, String quantity, String size,
			int discount, String status, String imgname) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
		this.discount = discount;
		this.status = status;
		this.imgname = imgname;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImgname(String imgname) {
		this.imgname = imgname;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", price="
				+ price + ", quantity=" + quantity + ", size=" + size + ", discount=" + discount + ", status=" + status
				+ ", imgname=" + imgname + " ]";
	}

}
