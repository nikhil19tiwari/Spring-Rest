package in.billing.nikhil.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.billing.nikhil.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	// Here we are dealing with CUSTOMER related part
}
