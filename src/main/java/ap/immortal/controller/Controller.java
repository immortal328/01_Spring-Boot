package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ap.immortal.model.Student;

@RestController
public class Controller {
	@Value("${props.name.firstName}")
	private String firstName;

	@Value("${props.name.lastName}")
	private String lastName;

	@GetMapping("/")
	public String sayHello() {
		return "Hello User...";
	}

	@GetMapping("/getStudent")
	public Student getStudent() {
		return new Student(28, 12, "Test", "Test", "test.test@gmail.com");

	}

	@GetMapping("/getStudentProps")
	public Student getStudentProps() {
		return new Student(28, 12, firstName, lastName,
				String.format("%s.%s@gmail.com", firstName, lastName).toLowerCase());

	}

}
