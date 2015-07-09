
//Use the Student class we previously developed
//Add an array of 50 courses (a student can take up to 50 courses)
//In the Student toString( ) method, loop through and print all courses the student has taken
//Add a method to allow the adding of a course to the student courses array
//Create an abstract method called isGraduateEligible( ) 
//
//Create a High School Student class as a subclass of Student
//Override the isGraduateEligible( ) method from the superclass
//HS student is eligible to graduate if s/he have takes 24 courses and passed each course 
//
//Create a College Student class as a subclass of Student
//Override the isGraduateEligible( ) method from the superclass
//College student is eligible to graduate if s/he accumulated 132 credits and passed each course 
//
//Create a StudentTest class
//Create an array of students that can hold both high school students and college students
//Instantiate a few high school students, and store in the array
//Instantiate a few college students, and store in the array
//Add courses to each students
//High School students courses must call course constructor (without number of credits parameter)
//College students courses must call course constructor (with number of credits parameter)
//PS. You can build a loop to create multiple courses quickly, or create a couple of courses with 50 credits each
//For each course, set the grade to either Pass/Fail (if string) or a number based on 100 (as you wish)
//Loop through all the students
//Print each student, including all courses taken, and his/her graduation eligibility
public class Course {
	
	private String courseId; // instance variables
	private String description;
	private String instructor;
	private int numCredits;
	private int grade;

	
	Course(String courseId, String description, String instructor) // first constructor
	{
		this.courseId = courseId;
		this.description = description;
		this.instructor = instructor;

	}
	
	Course(String courseId, String description, String instructor, int numCredits)  // Second constructor
	{
		this(courseId,description,instructor);
		this.numCredits = numCredits;
	}

	public String getCourseId() {	// Getters and Setters
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getNumCredits() {
		return numCredits;
	}

	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String toString() {
		// Formatting to align text to columns
		String format = "%-15s %-15s %-15s %-15s %-15s";

		String data = String.format(format, courseId, description, instructor,
				numCredits, grade);

		return (data);		
	}
	
	
}
