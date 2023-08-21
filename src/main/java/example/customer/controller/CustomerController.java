package example.customer.controller;

import example.customer.dto.CustomerRequest;
import example.customer.service.CustomerService;
import example.customer.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class CustomerController {
    @Autowired
    CustomerService customerServiceInterfare;

    @PostMapping("create/customer")
    public ResponseEntity<Response> createCustomer(@RequestBody CustomerRequest customerRequest) {
        return customerServiceInterfare.cretaeCustomer(customerRequest);
    }

    @GetMapping("get/customer/{id}")
    public  ResponseEntity<Response> getCustomer(@PathVariable Integer id) {
        return customerServiceInterfare.getCustomer(id);
    }

    @PutMapping("update/customer/{id}")
    public ResponseEntity<Response> updateCustomer(@RequestBody CustomerRequest customerRequest) {
        return customerServiceInterfare.updateCustomer(customerRequest);
    }

    @DeleteMapping("delete/customer/{id}")
    public ResponseEntity<Response> deleteustomer(@PathVariable Integer id) {
        return customerServiceInterfare.deleteCustomer(id);
    }
}
