package com.machinetest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machinetest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
