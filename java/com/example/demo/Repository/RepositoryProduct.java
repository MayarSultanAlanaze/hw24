package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface RepositoryProduct extends JpaRepository<Product,Integer> {

        Product findProductById(Integer id);

    }

