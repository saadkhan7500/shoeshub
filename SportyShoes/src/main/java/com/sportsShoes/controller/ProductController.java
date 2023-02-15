package com.sportsShoes.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sportsShoes.entities.Product;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.ProductRepo;
import com.sportsShoes.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService  productService;
	
	@Autowired
	private ProductRepo productRepo;
	

	
	@PostMapping("/product/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		product.setStatus("added");
		product.setImgname(" ");
		return productService.addProduct(product);
	}
	
	@GetMapping("/product/getproducts")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/getproduct/{id}")
	public Product getProduct(@PathVariable("id") int id)
	{
		return productService.getProduct(id);
	}
	
	@PutMapping("/product/updateproduct/{id}") public Product updateProduct(@RequestBody Product product , @PathVariable("id") int id)
	{ 
		return productService.updateProduct(product, id); 
	}
	
	@Value("${file.upload-dir}")
	String File_DIRECTOY;
	@PostMapping("/product/uploadimage")
	public ResponseEntity<Object> upload(@RequestParam("file") MultipartFile file,@RequestParam("pId")int id)throws IOException
	{
		System.out.println("Id = "+id);
		String absolutePath=File_DIRECTOY+file.getOriginalFilename();
		File myfile=new File(absolutePath);
		myfile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(myfile)) {
			fos.write(file.getBytes());
		}
		Product p=productRepo.findById(id);
		p.setImgname(file.getOriginalFilename());
		productRepo.save(p);
		System.out.println(p);
		return new ResponseEntity<Object>("file uploaded",HttpStatus.OK);
	}
	
	@GetMapping("/products/getcategory/{category}")
	public List<Product> findProdcutsByCategory(@PathVariable("category") String category)
	{
		return productService.findProdcutsByCategory(category);
	}
	 
	@GetMapping("/products/getbrandorcatgeory/{search}")
	public List<Product> findProductsByBrandOrCatgegory(@PathVariable("search")String search)
	{
		return productService.findProductsByBrandOrCatgegory(search);
	}
	/*
	 * @GetMapping("/products") public List<Product> getAllProducts() { return
	 * productService.getAllProducts(); }
	 * 
	 * @GetMapping("/products/{id}") public Product getProduct(@PathVariable("id")
	 * int id) { return productService.getProduct(id); }
	 * 
	 * @PostMapping("/products") public Product createProduct(@RequestBody Product
	 * product) { return productService.createProduct(product); }
	 * 
	 * @PutMapping("/products/{id}") public Product updateProduct(@RequestBody
	 * Product product , @PathVariable("id") int id) { return
	 * productService.updateProduct(product, id); }
	 * 
	 * @DeleteMapping("/products/{id}") public void
	 * deleteProduct(@PathVariable("id") int id) { productService.deleteProduct(id);
	 * }
	 */
}
