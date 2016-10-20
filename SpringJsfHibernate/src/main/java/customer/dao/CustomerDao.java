package customer.dao;

import customer.model.Customer;

import java.util.List;

public interface CustomerDao {

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();
}
