//=============================================================================
//The service class
//=============================================================================
public abstract class Student {
	private static int studentCount = 1000;
	private Course[] courses = new Course[50];

	private int studentId; // instance variables

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String email;
	private String etc;

	Student(String firstname, String lastname) // first constructor
	{
		this.firstname = firstname;
		this.lastname = lastname;
		studentId = studentCount++;

	}

	Student(String firstname, String lastname, String address, String city,
			String state, String email, String etc) {
		this(firstname, lastname); // call first constructor
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.etc = etc;
	}

	int numCourses = 1;

	public void addCourse(Course course) {
		courses[numCourses] = course;
		numCourses++;
	}

	// Setter and Getter for instance fields
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	// abstract method
	abstract boolean isGraduateEligible();

	int totalpassedcourse;
	int totalpassedcredit;

	public String toString() // toString instance method
	{

		// Formatting to align text to column headers
		String format = "%-15s %-15s %-15s %-20s %-15s %-15s %-20s %-10s";
		// printing header
		String data = String.format(format, studentId, firstname, lastname,
				address, city, state, email, etc);

		// if statement to format printing for students without courses
		for (int i = 1; i < courses.length; i++) {
			if ((courses[i] == null) && (i == 1)) {
				printHline();

				System.out.printf(format, "Student ID:", "First Name:",
						"Last Name:", "Address:", "City:", "State:", "Email:",
						"Etc:");
				data = data
						+ "\n\n\t\t\t\t***********************No Courses Taken**************************\n"
						+ "\t\t\t";

			}
			// if statement to format printing header for students with courses
			if ((courses[i] != null) && (i == 1)) {
				printHline();

				System.out.printf(format, "Student ID:", "First Name:",
						"Last Name:", "Address:", "City:", "State:", "Email:",
						"Etc:");
				data = data
						+ "\n\n\t\t\t\t*************************Courses Taken***************************\n"
						+ "\t\t\t\t";
				String data2 = String.format("%-15s %-15s %-15s %-15s %-15s",
						"CourseId:", "Description:", "Instructor:",
						"NumCredits:", "Grade:");
				data = data + data2 + "\n\t\t\t\t" + courses[i];

				if (courses[i].getGrade() >= 65) {
					totalpassedcourse = totalpassedcourse + 1;
					totalpassedcredit = totalpassedcredit + courses[i].getNumCredits();

				}

				// if statement to catch additional courses with no header
				// printing
			} else if (courses[i] != null) {
				data = data + "\n\t\t\t\t" + courses[i];
				if (courses[i].getGrade() >= 65) {
					totalpassedcourse = totalpassedcourse + 1;
					totalpassedcredit = totalpassedcredit + courses[i].getNumCredits();

				}

			}

		}

		System.out.print("\n");
		//Call isGraduateEligible method
		data =  data +"\nCan Graduate? " + isGraduateEligible() + "\tTotal Passed Course:"+totalpassedcourse+"\tTotal Passed Credit:"+totalpassedcredit;
		return (data);

	}

	// Method to print horizontal line
	public void printHline() {
		System.out.print("\n");
		{
			int i = 128; // i is some positive int
			for (int j = 1; j <= i; j++)
				System.out.print("=");
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
