package com.requestfilter.controller;

import com.requestfilter.models.SimpleRequest;
import com.requestfilter.dao.CustomerRepository;
import com.requestfilter.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/receivers")
@Validated
public class SimpleRequestController {

    @Autowired
    public CustomerRepository repository;


//    {"customerID":1,"tagID":2,
//    "userID":"aaaaaaaa-bbbb-cccc-1111-222222222222",
//    "remoteIP":"123.234.56.78",
//    "timestamp":1500000000
//    }

//    malformed JSON
//    missing one or more fields
//    with a customer ID not found in the database or for a customer which is disabled
//    with a remote IP address which is in the blacklist
//    with a user agent which is in the blacklist
    @PostMapping(produces = "application/json")
    @ResponseBody
    public ResponseEntity<SimpleRequest> customer(
            @Valid @RequestBody SimpleRequest simpleRequest) {

        Customer customer = repository.findByName("Big News Media Corp");
        System.out.println(customer);
        return ResponseEntity.ok(simpleRequest);
    }


}
