package net.code.java.ProductManager.repository;

import net.code.java.ProductManager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
