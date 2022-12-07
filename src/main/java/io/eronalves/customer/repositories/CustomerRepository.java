package io.eronalves.customer.repositories;

import org.springframework.data.repository.CrudRepository;

import io.eronalves.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
