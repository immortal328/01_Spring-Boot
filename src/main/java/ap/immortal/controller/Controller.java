package ap.immortal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ap.immortal.model.Student;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello User...";
	}
	
	@GetMapping("/getStudent")
	public Student getStudent() {
		return new Student(28,12,"Test","Test","test.test@gmail.com");
		
	}

}
