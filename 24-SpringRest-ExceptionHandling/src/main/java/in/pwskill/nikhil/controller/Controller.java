package in.pwskill.nikhil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskill.nikhil.model.Student;
import in.pwskill.nikhil.model.StudentNotFoundException;

@RestController
@RequestMapping("/v1/api/student")
public class Controller {

    @GetMapping("/A/{id}")
    public ResponseEntity<Student> getMap(@PathVariable Integer id) {
        if (id == 10) {
            Student body = new Student(10, "Nikihl", 23, "MI");
            return new ResponseEntity<>(body, HttpStatus.OK);
        }
        throw new StudentNotFoundException("The Student Not Found for the id: " + id);
    }
}
