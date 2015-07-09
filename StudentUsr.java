import java.util.Random;

//=============================================================================
//Authored by 
//High School and College Student Class
//=============================================================================

public class StudentUsr {
	public static void main(String[] args) {

		// Generate Random Students and Courses using first Student constructor
		int maxStudentObj = randInt(2, 6); // Set max number of student to
											// generate
		int randCourseGenerated = randInt(40, 50); // Sets max number of courses
													// to add
		int maxHighSchoolStudent = maxStudentObj / 2;
		int maxCollegeStudent = maxStudentObj - maxHighSchoolStudent;
		System.out.println("High School Students Generated:"
				+ maxHighSchoolStudent);
		System.out.println("College Students Generated:" + maxCollegeStudent);
		System.out.println("Students Generated:" + maxStudentObj);

		Student[] myAl = new Student[maxStudentObj];

		// Generating random high school student and courses and assigning to
		// array
		for (int y = 0; y < maxHighSchoolStudent; y++) {

			String randFname = "HS" + randomString(randInt(2, 5));
			String randLname = randomString(randInt(2, 5));
			StringBuilder sb1 = new StringBuilder();
			sb1.append(y);
			sb1.append(randLname);
			String strIlname = sb1.toString();
			myAl[y] = new HighSchoolStudent(randFname, strIlname);

		}

		// Generating random college student and courses and assigning to array
		for (int y = maxHighSchoolStudent; y < maxStudentObj; y++) {

			String randFname = "Coll" + randomString(randInt(2, 5));
			String randLname = randomString(randInt(2, 5));
			StringBuilder sb1 = new StringBuilder();
			sb1.append(y);
			sb1.append(randLname);
			String strIlname = sb1.toString();
			myAl[y] = new CollegeStudent(randFname, strIlname);

		}

		System.out.println("Courses Generated:" + randCourseGenerated);

		// Adding random courses for HS students using the non credit
		// constructor
		for (int x = 1; x <= randCourseGenerated; x++) {

			// Generate course Id string
			StringBuilder sb = new StringBuilder();
			sb.append("cs");
			sb.append(x);
			// Generate random course description
			String courseIdString = sb.toString();
			StringBuilder courseIdDescr = sb.append(randomString(6));
			String randCourseName = courseIdDescr.toString();
			Course randomCourse = new Course(courseIdString, randCourseName,
					randomString(5));
			// Adding random grade to course
			randomCourse.setGrade(randInt(60, 100));
			// Adding course to random student
			if (maxHighSchoolStudent > 0) {
				int randNbr = (randInt(0, (maxHighSchoolStudent - 1)));

				myAl[randNbr].addCourse(randomCourse);
			}
		}

		// Adding random courses for college students using credit
		// constructor
		for (int x = 1; x <= randCourseGenerated; x++) {

			// Generate course Id string
			StringBuilder sb = new StringBuilder();
			sb.append("cs");
			sb.append(x);
			// Generate random course description
			String courseIdString = sb.toString();
			StringBuilder courseIdDescr = sb.append(randomString(6));
			String randCourseName = courseIdDescr.toString();
			Course randomCourse = new Course(courseIdString, randCourseName,
					randomString(5), randInt(6, 50));
			// Adding random grade to course
			randomCourse.setGrade(randInt(50, 100));
			// Adding course to random student
			int randNbr = (randInt(maxHighSchoolStudent, (maxStudentObj - 1)));
			myAl[randNbr].addCourse(randomCourse);
		}

		// Printing Student Array
		for (Student p : myAl) {

			if (p != null) {
				System.out.println(p.toString());
			}
		}

	}

	// Random String Generator
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static Random rnd = new Random();

	static String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	// Random Number Generator
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
