package com.learning.app.repository;

import com.learning.app.repository.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDTO,Integer> {
}
