package com.example.dockerdemo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerdemo.entity.Customer;
import com.example.dockerdemo.model.ApiResponse;
import com.example.dockerdemo.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
	private final CustomerService s;

	@PostMapping
	public ResponseEntity<ApiResponse<Customer>> save(@RequestBody Customer c) {

		Customer savedCustomer = s.save(c);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ApiResponse<>("Customer created successfully", savedCustomer));
	}

	@GetMapping
	public ResponseEntity<ApiResponse<List<Customer>>> all() {

		List<Customer> customers = s.getAll();

		return ResponseEntity.ok(new ApiResponse<>("Customers fetched successfully", customers));
	}
}