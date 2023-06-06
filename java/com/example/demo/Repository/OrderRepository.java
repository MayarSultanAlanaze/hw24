package com.example.demo.Repository;

import com.example.demo.Model.Order;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{


    Order findOrderById(Integer id);
    List<Order>findOrderByUserId(Integer id);
}

