package com.cjc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
