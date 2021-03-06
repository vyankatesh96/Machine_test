package com.machinetest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.Entities.Category;
import com.machinetest.dao.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category addcategory(Category c) {
		
		return categoryRepository.save(c);
	}
	
	public void updateCategory(Category c, int id) {
		
		c.setCid(id);
		categoryRepository.save(c);
	}
	
	public void deleteById(int id) {
		
		categoryRepository.deleteById(id);
	}
	
	public List<Category> getAllCategory(){
		
		return categoryRepository.findAll();
	}
	
	public Category findById(int id) {
		
		return categoryRepository.findById(id).get();
	}
}
