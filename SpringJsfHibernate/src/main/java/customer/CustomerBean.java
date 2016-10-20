package customer;


import customer.bo.CustomerBo;
import customer.model.Customer;

import java.util.List;

import java.io.Serializable;

public class CustomerBean  implements Serializable{

    CustomerBo customerBo;

    public String name;
    public String address;
    //getter and setter methods

    public void setCustomerBo(CustomerBo customerBo) {
        this.customerBo = customerBo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //------------

    //get all customer data from database
    public List<Customer> getCustomerList(){
        return customerBo.findAllCustomer();
    }

    //add a new customer data into database
    public String addCustomer(){

        Customer cust = new Customer();
        cust.setName(getName());
        cust.setAddress(getAddress());

        customerBo.addCustomer(cust);

        clearForm();

        return "";
    }

    //clear form values
    private void clearForm(){
        setName("");
        setAddress("");
    }
}
