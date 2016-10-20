package customer.bo;

import customer.model.Customer;

import java.util.List;


public interface CustomerBo{
 
	void addCustomer(Customer customer);
	
	List<Customer> findAllCustomer();
 
}