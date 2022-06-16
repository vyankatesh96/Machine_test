package com.machinetest.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.Entities.Product;
import com.machinetest.dao.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	
	
	
	public Product addproduct(Product p) {
		
		return productRepo.save(p);
	}
	
	public void updateproduct(Product p, int id) {
		
		p.setPid(id);
		productRepo.save(p);
	}

	public void deleteById(int id) {
		 productRepo.deleteById(id);
		
	}
	
	public List<Product> getAllProducts(){	
		return productRepo.findAll();
		
	}

	public Product getById(int id) {
		
		return productRepo.findById(id).get();
	}
}
