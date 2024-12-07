package com.klef.repository;

public class customer {

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.klef.springboot.model.Customer;

	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, Long>
	{

	}
