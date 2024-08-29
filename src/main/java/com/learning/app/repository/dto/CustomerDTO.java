package com.learning.app.repository.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@Entity
@ToString
@Table(name = "customer")
public class CustomerDTO {
    @Id
    @Column(name = "customer_id")
    private int customerID;
    @Column(name ="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String emailId;
    @Column(name = "created_at")
    private Date createdAt;
}
