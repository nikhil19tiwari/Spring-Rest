package in.billing.nikhil.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.billing.nikhil.Model.Customer;
import in.billing.nikhil.Repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
 
	@Autowired
	private CustomerRepo repo; 
	@Override
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer) ;
	}

	@Override
	public Customer getCustomerById(Integer Id) {
		return repo.findById(Id).get();
	}

	@Override
	public void deleteCustomerById(Integer Id) {
    repo.deleteById(Id);
	}

}
