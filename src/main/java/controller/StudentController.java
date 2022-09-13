package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity1.Student;
import service.StudentService;

@RestController
@RequestMapping("api/v1/student-service")
public class StudentController {

@Autowired
StudentService stuService;

/*
 * It is responsible for sending the response to the client converting java
 * objects to json by default along with the status code
 * 
 * 
 */

ResponseEntity<?> responseEntity;

@PostMapping("/student")
public ResponseEntity<?> saveStudent(@RequestBody Student student) {
	Student createdStudent = this.stuService.saveStudent(student);
	responseEntity = new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
	return responseEntity; 
	
}


}
