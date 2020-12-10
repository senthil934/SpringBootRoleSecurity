package com.pack.SpringBootRoleBasedSecurity.service;

import java.util.List;

import com.pack.SpringBootRoleBasedSecurity.model.Product;

public interface ProductService {
      void saveProduct(Product product);
      List<Product> fetchAllProduct();
      Product getProductById(long id);
      void updateProduct(Product product);
      void deleteProduct(long id);
}
