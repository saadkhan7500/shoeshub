package com.sportsShoes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.client.RestTemplate;

import com.sportsShoes.entities.Product;
import com.sportsShoes.repository.ProductRepositories;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SportsShoesApplicationTests {

	
	@LocalServerPort
    private int port;
	
	private String baseUrl = "http://localhost";
	
	private static RestTemplate restTemplate;
	
	 @Autowired
	 private ProductRepositories productRepo;

	    @BeforeAll
	    public static void init() {
	        restTemplate = new RestTemplate();
	    }
	    
	    @BeforeEach
	    public void setUp() {
	        baseUrl = baseUrl.concat(":").concat(port + "").concat("/product");
	    }
	    
	    @Test
	    public void testAddProduct() {
	        Product product = new Product(1, "sneakers", "gucci", "men", "8999", "4", "7", 20, " ", " ");
	        Product response = restTemplate.postForObject(baseUrl+"/addproduct", product, Product.class);
	        assertEquals("sneakers", response.getName());
	        assertEquals("gucci",response.getBrand());
	    }
	    
	    @Test
	    @Sql(statements = "INSERT INTO Products (id, brand, category, discount, name, price, quantity, size) VALUES (303, 'Gucci', 'men', '12', 'lofer', '2000', '7', '8');", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	    @Sql(statements = "DELETE FROM Products WHERE id=303", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
	    public void testGetProducts() {
	        List<Product> products = restTemplate.getForObject(baseUrl+"/getproducts", List.class);
	        assertEquals(1, products.size());
	    }
	    
	    
	  
}
