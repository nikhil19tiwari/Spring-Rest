package in.pwskill.nikhil.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import in.pwskill.nikhil.Bean.Role;
import in.pwskill.nikhil.Bean.User;

@RestController
@RequestMapping("/v1/api/dis")
public class Controller {

	private Role role;

	/***
	 * 1.Method  ::Get
	 * 2.Path    ::/A
	 * 3.R.T     ::ResponseEntity<User>
	 * 4.Input   ::No
	 */
	
	@GetMapping("/A")
	public ResponseEntity<User> getmapping(){
		User body = new User("1","Nikhil Tiwari","21","NSP",List.of("vivek Pandey", "Ankit shukla","nikhil"),
				             Map.of("Nikhil", 12345L, "Ram", 12345L));
		return new ResponseEntity<>(body,HttpStatus.OK);
	}
	
	/***
	 * 1.Method  ::Get
	 * 2.Path    ::/B
	 * 3.R.T     ::ResponseEntity<List>
	 * 4.Input   ::No
	 */
	
	@GetMapping("/B")
	public ResponseEntity<List<String>>getmap(){
		return new ResponseEntity<>(List.of("nikhil", "tiwari", "ram"),HttpStatus.OK);
	}
	
	/***
	 * 1.Method  ::Get
	 * 2.Path    ::/C
	 * 3.R.T     ::ResponseEntity<Map>
	 * 4.Input   ::No
	 */
	
	@GetMapping("/C")
	public ResponseEntity<Map<String,Long>>getmapP(){
		return new ResponseEntity<>(Map.of("Nikhil", 123L, "tiwari", 145L),HttpStatus.OK);
	}
	
	/***
	 * 1.Method  ::Get
	 * 2.Path    ::/D
	 * 3.R.T     ::ResponseEntity<Map>
	 * 4.Input   ::No
	 */
	
	@GetMapping("/D")
	public ResponseEntity<Map<String,Role>>getmappi(){
		return new ResponseEntity<>(Map.of("Nikhil", new Role("1","SDEII"), "Ram", new Role("2","SDEIII")),HttpStatus.OK);
	}
	/***
	 * 1.Method  ::Post
	 * 2.Path    ::/E
	 * 3.R.T     ::ResponseEntity<?>
	 * 4.Input   ::No
	 */
    
	@PostMapping("/E/{userId}")
	public ResponseEntity<?> PostMapp(@PathVariable String userId) {
	    HttpHeaders headers = new HttpHeaders(); // Initialize headers

	    if (userId.equals("5")) {
	        headers.add("True", "Yes");
	        User body = new User("1", "name", "21", "MI", null, null); // Assuming User class exists
	        return new ResponseEntity<>(body, headers, HttpStatus.OK);
	    }

	    headers.add("False", "No");
	    return new ResponseEntity<>("no body", headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
}























