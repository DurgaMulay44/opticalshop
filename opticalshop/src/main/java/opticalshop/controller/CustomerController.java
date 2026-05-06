package opticalshop.controller;

import opticalshop.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    List<Customer> customers = new ArrayList<>();

    @PostMapping
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Customer added!";
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customers;
    }
}