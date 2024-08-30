package in.pwskill.nikhil.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.pwskill.nikhil.Bean.Student;

@RestController
@RequestMapping("/v1/api/show")
public class Controller {

	/**
	 * 1.Method :: Get
	 * 2.R.T    :: ResponseEntity<Student>
	 * 3.Path   :: /x
	 * 4.input  :: No
	 */
	
	@GetMapping("/x")
	public ResponseEntity<Student> getmapping(){
		Student body = new Student("1","Nikhil","21","MI");
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	/**
	 * 1.Method :: Post
	 * 2.R.T    :: ResponseEntity<Student>
	 * 3.Path   :: /y
	 * 4.input  :: Student
	 */
	
	@PostMapping("/y")
	public ResponseEntity<Student>postMapping(
			                                 @RequestBody Student student
			                                  ){
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	/**
	 * 1.Method :: Post
	 * 2.R.T    :: ResponseEntity<Student>
	 * 3.Path   :: /z
	 * 4.input  :: ID
	 */
	
	@PostMapping("/z")
	public ResponseEntity<Student>postByIdMapping(
			                                  @RequestParam  String Id
			                                      ){
	      Student body = new Student("Id","Nikhil","21","Bandra");
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	/**
	 * 1.Method :: Post
	 * 2.R.T    :: ResponseEntity<?>
	 * 3.Path   :: /za
	 * 4.input  :: ID,name
	 */
	@PostMapping("/za")
	public ResponseEntity<?>postByidandName(
			                                  @RequestParam  String Id,
			                                  @RequestParam  String name
			                                      ){
	   if(Id.equals("10") && name.equals("nikhil")) {
		   Student body = new Student("Id","Nikhil","21","Bandra");
			return new ResponseEntity<Student>(body,HttpStatus.OK);
	   }
	   else 
		   return new ResponseEntity<String>("Not found yar bhai",HttpStatus.OK);
	   
	}
	
	/**
	 * 1.Method :: Post
	 * 2.R.T    :: ResponseEntity<?>
	 * 3.Path   :: /zb
	 * 4.input  :: ID,name
	 */
	
	@PostMapping("/zb/{Id}/{name}")
	public  ResponseEntity<?>postbyPathVariable(
			             @PathVariable String Id,
			               @PathVariable String name
			                                   ){
		 if(Id.equals("10") && name.equals("nikhil")) {
			   Student body = new Student("Id","Nikhil Tiwari","21","Bandra");
				return new ResponseEntity<Student>(body,HttpStatus.OK);
		   }
		   else 
			   return new ResponseEntity<String>("Not found yar bhai",HttpStatus.OK);
		   
	}
	
}
