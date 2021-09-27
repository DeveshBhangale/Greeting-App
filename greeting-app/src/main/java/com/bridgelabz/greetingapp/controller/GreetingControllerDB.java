package com.bridgelabz.greetingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.greetingapp.Services.Customer;
import com.bridgelabz.greetingapp.repo.ICustomer;

@RestController
@RequestMapping("/Customer")
public class GreetingControllerDB {
	
	@Autowired
	ICustomer repositoryCustomer;

	
	@RequestMapping(value = {"/save","/setName"})
	public void save(@RequestBody Customer customer){
		repositoryCustomer.save(customer);
	}
	
	@GetMapping("/getData")
	public List<Customer> getData() {
		return repositoryCustomer.findAll();
	}
	
	@GetMapping("/getSpecificData")
	public String getSpecificData(@RequestParam Integer id) {
		return repositoryCustomer.findById(id).get().getName();
	}
	
	@DeleteMapping("/del")
	public void deleteData(@RequestParam Integer id) {
		repositoryCustomer.delete(repositoryCustomer.findById(id).get());
	}
	
}
