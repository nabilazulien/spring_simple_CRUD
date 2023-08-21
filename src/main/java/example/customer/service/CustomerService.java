package example.customer.service;

import example.customer.dto.CustomerRequest;
import example.customer.util.Response;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<Response> cretaeCustomer(CustomerRequest customerRequest);
    ResponseEntity<Response> getCustomer(int id);
    ResponseEntity<Response> updateCustomer(CustomerRequest customerRequest);
    ResponseEntity<Response> deleteCustomer(int id);
}
