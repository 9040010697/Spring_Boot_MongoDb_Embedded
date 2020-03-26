package com.mde.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mde.model.Product;

public interface ProductRepo extends MongoRepository<Product, Integer>{

}
