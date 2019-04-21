package com.example.TestShop2.repos;

import com.example.TestShop2.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
