package icici.corebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icici.corebanking.entity.Customer;
import icici.corebanking.pojo.CustomerPojo;
import icici.corebanking.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerReopository;

	@Override
	public CustomerPojo saveCustomer(CustomerPojo customerPojo) {
		System.out.println("Inside Save method CustomerServiceI..mpl");

		Customer customer = new Customer();
		customer.setCustomerName(customerPojo.getCustomerName());
		customer.setAge(customerPojo.getAge());

		customerReopository.save(customer);
		
		customerPojo.setCid(customer.getCid());

		return customerPojo;

	}

}
