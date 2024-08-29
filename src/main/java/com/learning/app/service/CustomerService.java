package com.learning.app.service;

import com.learning.app.repository.dto.CustomerDTO;

public interface CustomerService {
     CustomerDTO findCustomerById();
     CustomerDTO saveCustomers(CustomerDTO customerDTO);
}
