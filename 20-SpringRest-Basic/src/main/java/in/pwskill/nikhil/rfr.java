package in.pwskill.nikhil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lib")
public class rfr {

	@GetMapping("/f")
	public ResponseEntity<String>go(){
		return new ResponseEntity<>("request from get",HttpStatus.OK);
	}
}
