package in.pwskill.nikhil.myerror;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.pwskill.nikhil.model.EmployeeNotFoundException;
import in.pwskill.nikhil.model.MyError;

@RestControllerAdvice
public class MyCustomError extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(value =  EmployeeNotFoundException.class)
	public ResponseEntity<MyError>showGlobalError(
			                                  EmployeeNotFoundException enf
			                                      ){
		MyError body = new MyError(new Date().toString(),
				                    "Employee Not Found",
				                    404,
				                    enf.getMessage());
		return new ResponseEntity<>(body,HttpStatus.NOT_FOUND);
	}
}