package com.springdemo.orm_jpa_hibernate_springdata.repository;

import com.springdemo.orm_jpa_hibernate_springdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
