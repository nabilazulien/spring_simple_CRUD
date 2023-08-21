package example.customer.service;

import example.customer.dto.CustomerRequest;
import example.customer.model.Customer;
import example.customer.repository.CustomerRepository;
import example.customer.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public ResponseEntity<Response> cretaeCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setNik(customerRequest.getNIK());
        customer.setNama(customer.getNama());
        customer.setTempatLahir(customerRequest.getTempatLahir());
        customer.setTanggalLahir(customerRequest.getTanggalLahir());
        customer.setAgama(customer.getAgama());
        customer.setAlamat(customer.getAlamat());
        customerRepository.save(customer);
        return ResponseEntity.ok(new Response("200", "success", "customer " + customerRequest.getNama() + " berhasil"));
    }

    @Override
    public ResponseEntity<Response> getCustomer(int id) {
        return ResponseEntity.ok(new Response("200", "success", "customer" + getCustomer(id)));
    }

    @Override
    public ResponseEntity<Response> updateCustomer(CustomerRequest customerRequest) {
        return ResponseEntity.ok(new Response("200", "success", "customer " + customerRequest.getNama() + " berhasil update"));
    }

    @Override
    public ResponseEntity<Response> deleteCustomer(int id) {
        return ResponseEntity.ok(new Response("200", "success", "berhasil delete"));
    }
}