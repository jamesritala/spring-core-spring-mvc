package guru.springframework.services;

import guru.springframework.domain.Customer;
import guru.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer,Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    @Override
    public List<Customer> listAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null){
            if (customer.getId() == null){
                customer.setId(getNextKey());
            }
            customers.put(customer.getId(), customer);

            return customer;
        } else {
            throw new RuntimeException("Product Can't be nill");
        }
    }

    private Integer getNextKey(){
        return Collections.max(customers.keySet()) + 1;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
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
        product1.setAddressLine2("Kings Suburb");
        product1.setCity("Jerusalem");
        product1.setState("Israel");
        product1.setZipCode("0001");

        customers.put(1, product1);

        Customer product2 = new Customer();
        product2.setId(2);
        product2.setFirstname("Simon");
        product2.setLastname("Peter");
        product2.setEmail("peter@heaven.com");
        product2.setPhone("000000000");
        product2.setAddressLine1("3 Mt Zion");
        product2.setAddressLine2("Eldersville");
        product2.setCity("Jerusalem");
        product2.setState("Israel");
        product2.setZipCode("0001");

        customers.put(2, product2);

        Customer product3 = new Customer();
        product3.setId(3);
        product3.setFirstname("Farai");
        product3.setLastname("Mukoma");
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
