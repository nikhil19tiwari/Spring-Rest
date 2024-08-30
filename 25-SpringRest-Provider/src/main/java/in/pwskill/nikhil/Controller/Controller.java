package in.pwskill.nikhil.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/Student")
public class Controller {

	/**
	 * 1.Method :: Get
	 * 2.Path   :: /A
	 * 3.R.T    :: ResponseEntity<String>
	 * 4.Input  :: No Input
	 */
	
	@GetMapping("/A")
	public ResponseEntity<String>getmap(){
		
		return new ResponseEntity<>("Hii bro this is come from Get Mapping",HttpStatus.OK);
	}
}
