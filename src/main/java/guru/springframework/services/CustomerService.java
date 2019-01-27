package guru.springframework.services;

import guru.springframework.domain.Customer;


import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdateCustomer(Customer product);

    void deleteCustomer(Integer id);
}
