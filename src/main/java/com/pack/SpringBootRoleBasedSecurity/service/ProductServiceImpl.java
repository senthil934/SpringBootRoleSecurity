package com.pack.SpringBootRoleBasedSecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.SpringBootRoleBasedSecurity.model.Product;
import com.pack.SpringBootRoleBasedSecurity.repository.ProductRepsitory;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private ProductRepsitory productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> fetchAllProduct() {
		List<Product> list=productRepository.findAll();
		return list;
	}

	@Override
	public Product getProductById(long id) {
		Product prod=productRepository.getOne(id);
		return prod;
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(long id) {
		productRepository.deleteById(id);
	}

}
