package com.machinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machinetest.Entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
