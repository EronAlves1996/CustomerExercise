package io.eronalves.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.eronalves.customer.model.Customer;
import io.eronalves.customer.repositories.CustomerRepository;

@SpringBootTest
class CustomerApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Test
	void testCreate() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("José");
		customer.setEmail("jose@jose.com");
		repository.save(customer);
	}

}
