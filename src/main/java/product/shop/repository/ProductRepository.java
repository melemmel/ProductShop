package product.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import product.shop.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}