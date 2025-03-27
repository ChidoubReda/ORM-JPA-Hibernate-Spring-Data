package com.springdemo.orm_jpa_hibernate_springdata;

import com.springdemo.orm_jpa_hibernate_springdata.entities.Product;
import com.springdemo.orm_jpa_hibernate_springdata.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmJpaHibernateSpringDataApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(OrmJpaHibernateSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Laptop", 1000, 5));
        productRepository.save(new Product(null, "Mobile", 500, 10));
        productRepository.save(new Product(null, "Tablet", 300, 15));
        productRepository.save(new Product(null, "Smart Watch", 200, 20));
        productRepository.save(new Product(null, "Headphone", 100, 25));
        productRepository.save(new Product(null, "Mouse", 50, 30));
        List<Product> products = productRepository.findAll();
        products.forEach(p ->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("*********************Product with id 1 *********************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("******************************************");
    }

}


