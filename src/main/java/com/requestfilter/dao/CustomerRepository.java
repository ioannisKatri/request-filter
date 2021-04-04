package com.requestfilter.dao;

import com.requestfilter.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findByName(String name);
}
