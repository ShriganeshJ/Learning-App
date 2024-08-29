package com.learning.app.service.imp;

import com.learning.app.repository.CustomerRepository;
import com.learning.app.repository.dto.CustomerDTO;
import com.learning.app.service.CustomerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CustomerServiceServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerDTO findCustomerById() {
        return null;
    }

    @Override
    public CustomerDTO saveCustomers(CustomerDTO customerDTO) {
        CustomerDTO dto=   customerRepository.save(customerDTO);
        log.info("Customer DTO >>>"+dto);
        return dto;
    }
}
