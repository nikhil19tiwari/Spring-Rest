package in.billing.nikhil.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import in.billing.nikhil.Model.Customer;
import in.billing.nikhil.Service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
	private CustomerService service;
	
    /****
     * 1. Method  : Get
     * 2. Action  : form
     * 3. R.T     :/dispForm
     * 4.Input    : Model
     */
    
    @GetMapping("/form")
    public String displayWelcome() {
    	return "employee/dispForm";
    }
   /****
    * 1. Method  : Post
    * 2. Action  : save
    * 3. R.T     :/showForm
    * 4.Input    : Model
    */
    
    @GetMapping("/showFormAdmin")
    public String saveRecord(
    		){
    	return "employee/AdminshowForm";
    	
    }
    
    /****
     * 1. Method  : Post
     * 2. Action  : create
     * 3. R.T     :/createCustomer
     * 4.Input    : Model
     */
    
    @PostMapping("/createCustomer")
    public String createCustomer(@ModelAttribute Customer customer, Model model) {
        service.saveCustomer(customer);
        return "employee/creationSuccess";
    }
    
    /****
     * 1. Method  : Post
     * 2. Action  : delete
     * 3. R.T     :/deleteCustomer
     * 4.Input    : Model
     */
    
    @PostMapping("/deleteCustomer")
    public String deleteCustomerById(
    		@ModelAttribute Customer customer,
    		Model model
    		                ) {
    	service.deleteCustomerById(customer.getCustomer_Id());
    	return "employee/deleteSuccessful";
    }
    
    
    /****
     * 1. Method  : Get
     * 2. Action  : create
     * 3. R.T     :/createCustomer
     * 4.Input    : Model
     */
    
    @GetMapping("/selectCustomer")
    public String selectCustomer(@ModelAttribute Customer customer,
    		                      Model model ) {
    	List<Customer>customer1 = service.getAllCustomer(); 
    	model.addAttribute("customer1",customer1);

    	return "employee/selectCustomer";
    }
}
