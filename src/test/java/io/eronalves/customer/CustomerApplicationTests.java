package io.eronalves.customer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

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

	@Test
	void testRead() {
		Optional<Customer> customer = repository.findById(1);
		if (customer.isPresent())
			System.out.println(customer.get());
	}

	@Test
	void testUpdate() {
		Customer c = repository.findById(1).get();
		c.setEmail("newEmail@email.com");
		repository.save(c);
		System.out.println(repository.findById(1).get());
	}

	@Test
	void testDelete() {
		repository.deleteById(1);
		assertTrue(repository.findById(1).isEmpty());
	}

}
