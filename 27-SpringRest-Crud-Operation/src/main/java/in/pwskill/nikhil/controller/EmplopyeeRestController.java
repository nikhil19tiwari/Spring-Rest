package in.pwskill.nikhil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskill.nikhil.model.Employee;
import in.pwskill.nikhil.service.IemployeeService;

@RestController
@RequestMapping("/v1/api/emp")
public class EmplopyeeRestController {
	
	@Autowired
	private IemployeeService service;

	/*
	 * 1.Method  :: Post
	 * 2.Path    :: /save
	 * 3.R.T     :: ResponseEntity<String>
	 * 4.Input   :: Employee
	 */
	
	@PostMapping("/save")
	public ResponseEntity<String>saveEmployee(
			                               @RequestBody Employee employee
			                                    ){
	Integer id = service.saveEmployee(employee);
	String body = "Employee "+id+"  Created";
		return new ResponseEntity<>(body,HttpStatus.CREATED);
	}
	
	/*
	 * 1.Method  :: Get
	 * 2.Path    :: /get
	 * 3.R.T     :: ResponseEntity<Employee>
	 * 4.Input   :: id
	 */
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee>getEmpoyee(
			                                @PathVariable Integer id
			                                  ){
		Employee body = service.getOneempoyee(id);
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	/*
	 * 1.Method  :: Get
	 * 2.Path    :: /getAll
	 * 3.R.T     :: ResponseEntity<List<Employee>>
	 * 4.Input   :: No Input
	 */
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> body = service.getAllemployee();
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	/*
	 * 1.Method  :: Put
	 * 2.Path    :: /update
	 * 3.R.T     :: ResponseEntity<String>
	 * 4.Input   :: Employee
	 */
	
	@PutMapping("/update")
	public ResponseEntity<String>updateEmployee(
			                                 @RequestBody Employee employee
			                                    ){
		
		String body = service.updateEmployee(employee);
	  return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	
	/*
	 * 1.Method  :: Delete
	 * 2.Path    :: /delete
	 * 3.R.T     :: ResponseEntity<String>
	 * 4.Input   :: Integer
	 */
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteEmployee(
			                                @PathVariable Integer id
			                                    ){
		 String body = service.deleteEmployee(id);
		 return new ResponseEntity<>(body,HttpStatus.OK);
		 
	}
	
}