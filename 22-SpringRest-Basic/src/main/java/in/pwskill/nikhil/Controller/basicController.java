package in.pwskill.nikhil.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/show")
public class basicController {

	/***
	 * 1.Method  :: Get
	 * 2.Path    :: /A
	 * 3.Input   :: No Input
	 * 4.R.T     :: ResponseEntity<String>
	 */
	
	@GetMapping("/A")
	public ResponseEntity<String>GetMap(){
		
		return new ResponseEntity<>("Hii this message is from get",HttpStatus.OK);
	}
	
	/***
	 * 1.Method  :: Post
	 * 2.Path    :: /B
	 * 3.Input   :: No Input
	 * 4.R.T     :: ResponseEntity<String>
	 */
	
	@PostMapping("/B")
	public ResponseEntity<String> postmap(){
		return new ResponseEntity<>("Hii this message is from Post",HttpStatus.OK);
	}
	
	/***
	 * 1.Method  :: Put
	 * 2.Path    :: /C
	 * 3.Input   :: No Input
	 * 4.R.T     :: ResponseEntity<String>
	 */
	
	@PutMapping("/C")
	public ResponseEntity<String> putmap(){
		return new ResponseEntity<>("Hii this message is from Put",HttpStatus.OK);
	}
	
	/***
	 * 1.Method  :: Delete
	 * 2.Path    :: /D
	 * 3.Input   :: No Input
	 * 4.R.T     :: ResponseEntity<String>
	 */
	
	@DeleteMapping("/D")
	public ResponseEntity<String> deletemap(){
		return new ResponseEntity<>("Hii this message is from Delete",HttpStatus.OK);
	}
	
}
