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

import com.machinetest.Entities.Category;
import com.machinetest.Service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")
	public Category addcategory(@RequestBody Category c) {
		
		return categoryService.addcategory(c);
	}
	
	@PutMapping("/category/{id}")
	public void updateCategory(@RequestBody Category c, @PathVariable("id") int id) {
			
			categoryService.updateCategory(c, id);
		}
	
	@DeleteMapping("/category/{id}")
	public void deleteById(@PathVariable("id") int id) {
		
		categoryService.deleteById(id);
	}
	
	@GetMapping("/categories")
	public List<Category> getAllCategory(){
		
		return categoryService.getAllCategory();
	}
	
	@GetMapping("/categories/{id}")
	public Category findById(@PathVariable("id") int id) {
		
		return categoryService.findById(id);
	}
}
