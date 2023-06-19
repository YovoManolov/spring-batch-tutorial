package com.javatechie.batchprocessingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.batchprocessingdemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
