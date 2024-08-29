package com.learning.app.controller;
import com.learning.app.repository.dto.CustomerDTO;
import com.learning.app.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Log4j2
public class CustomerController {
@Autowired
    CustomerService customerService;

    @Tag(name = "post", description = "GET methods of Employee APIs")
    @PostMapping("/customer")
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customer) {
        CustomerDTO savedCustomer = customerService.saveCustomers(customer);
        log.info("Customer");
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

}
