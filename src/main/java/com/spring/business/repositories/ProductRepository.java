package com.spring.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
	public Product findByPname(String name);

}
