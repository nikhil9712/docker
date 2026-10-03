package com.example.dockerdemo.service;

import java.util.*;
import com.example.dockerdemo.entity.Customer;

public interface CustomerService {
	Customer save(Customer c);

	List<Customer> getAll();
}