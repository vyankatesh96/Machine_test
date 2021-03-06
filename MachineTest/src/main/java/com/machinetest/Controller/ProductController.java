package com.machinetest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.machinetest.Entities.Product;
import com.machinetest.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public Product addproduct(@RequestBody Product product) {
		
		return productService.addproduct(product);
		
	}
	
	@PutMapping("/product/{id}")
	public void updateproduct(@RequestBody Product product,@PathVariable("id")  int id) {
		
		 productService.updateproduct(product, id);
		 System.out.println("Product updated in the database"+product);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteById(@PathVariable("id") int id) {
		
		 productService.deleteById(id);
		 System.out.println("Product deleted in the database"+id);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getById(@PathVariable("id") int id) {
		
		return productService.getById(id);
	}
}
