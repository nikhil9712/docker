package com.example.dockerdemo.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.dockerdemo.entity.Customer;
import com.example.dockerdemo.repository.CustomerRepository;
import com.example.dockerdemo.service.CustomerService;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
	private final CustomerRepository r;

	public Customer save(Customer c) {
		return r.save(c);
	}

	public List<Customer> getAll() {
		return r.findAll();
	}
}