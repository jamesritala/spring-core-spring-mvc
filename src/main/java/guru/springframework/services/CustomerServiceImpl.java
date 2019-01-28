package guru.springframework.services;

import guru.springframework.domain.Customer;
import guru.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer,Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    @Override
    public List<Customer> listAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return null;
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer product) {
        return null;
    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    private void loadCustomers(){
        customers = new HashMap<>();

        Customer product1 = new Customer();
        product1.setId(1);
        product1.setFirstname("James");
        product1.setLastname("Ritala");
        product1.setEmail("jay@me.com");
        product1.setPhone("0110024567");
        product1.setAddressLine1("1 Mt Zion");
        product1.setAddressLine2("Jerusalem");
        product1.setCity("Jerusalem");
        product1.setState("Israel");
        product1.setZipCode("0001");

        customers.put(1, product1);

        Customer product2 = new Customer();
        product2.setId(2);
        product2.setFirstname("James");
        product2.setLastname("Ritala");
        product2.setEmail("jay@me.com");
        product2.setPhone("0110024567");
        product2.setAddressLine1("1 Mt Zion");
        product2.setAddressLine2("Jerusalem");
        product2.setCity("Jerusalem");
        product2.setState("Israel");
        product2.setZipCode("0001");

        customers.put(2, product2);

        Customer product3 = new Customer();
        product3.setId(3);
        product3.setFirstname("James");
        product3.setLastname("Ritala");
        product3.setEmail("jay@me.com");
        product3.setPhone("0110024567");
        product3.setAddressLine1("1 Mt Zion");
        product3.setAddressLine2("Jerusalem");
        product3.setCity("Jerusalem");
        product3.setState("Israel");
        product3.setZipCode("0001");

        customers.put(3, product3);


    }
}
