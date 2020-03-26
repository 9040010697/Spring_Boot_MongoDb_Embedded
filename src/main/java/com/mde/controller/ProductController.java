package com.mde.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mde.model.Product;
import com.mde.repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo repo;

	@PostMapping("/save")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		return ResponseEntity.ok(repo.save(product));
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getProducts() {
		return ResponseEntity.ok(repo.findAll());

	}
}
