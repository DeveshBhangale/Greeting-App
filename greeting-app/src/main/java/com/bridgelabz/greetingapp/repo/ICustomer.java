package com.bridgelabz.greetingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bridgelabz.greetingapp.Services.Customer;


public interface ICustomer extends JpaRepository<Customer,Integer> {

}