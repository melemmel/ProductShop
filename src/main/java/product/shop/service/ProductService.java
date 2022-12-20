package product.shop.service;

import java.util.List;

import product.shop.model.Product;



public interface ProductService {
    List < Product > getAllProducts();
    void saveProduct(Product product);
   Product getProductById(long id);
    void deleteProductById(long id);
}