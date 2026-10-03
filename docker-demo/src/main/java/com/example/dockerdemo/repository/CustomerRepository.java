package com.example.dockerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dockerdemo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}