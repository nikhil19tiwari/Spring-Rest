package in.billing.nikhil.Service;

import java.util.List;

import in.billing.nikhil.Model.Customer;

public interface CustomerService {
public List<Customer>getAllCustomer();
public Customer saveCustomer(Customer customer);

public Customer getCustomerById(Integer Id);
public void deleteCustomerById(Integer Id);

}
