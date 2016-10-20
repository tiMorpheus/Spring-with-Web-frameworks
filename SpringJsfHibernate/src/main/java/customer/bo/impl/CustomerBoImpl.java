package customer.bo.impl;

import customer.bo.CustomerBo;
import customer.dao.CustomerDao;
import customer.model.Customer;

import java.util.List;

public class CustomerBoImpl implements CustomerBo{

    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }
}
