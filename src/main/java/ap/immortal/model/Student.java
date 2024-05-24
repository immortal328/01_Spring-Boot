package ap.immortal.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	
	private int rollNumber;
	private int std;
	private String firstName;
	private String lastName;
	private String emailId;

}
