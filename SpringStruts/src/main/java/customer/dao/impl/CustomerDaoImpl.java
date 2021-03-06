package customer.dao.impl;

import customer.dao.CustomerDao;
import customer.model.Customer;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.Date;
import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	
	public void addCustomer(Customer customer){
		
		customer.setCreatedDate(new Date());
		getHibernateTemplate().save(customer);

	}
	
	public List<Customer> findAllCustomer(){
		
		return getHibernateTemplate().find("from Customer");
		
	}
}