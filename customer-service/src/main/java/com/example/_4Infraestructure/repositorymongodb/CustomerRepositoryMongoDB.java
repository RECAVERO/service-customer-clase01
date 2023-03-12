package com.example._4Infraestructure.repositorymongodb;

import com.example._4Infraestructure.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepositoryMongoDB extends MongoRepository<Customer, String> {
}
