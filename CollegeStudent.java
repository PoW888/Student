
public class CollegeStudent extends Student {


	CollegeStudent(String firstname, String lastname) {
		super(firstname,lastname);
	}
	
	CollegeStudent(String firstname, String lastname, String address, String city,
			String state, String email, String etc) {
		super(firstname,lastname,address,city,state,email,etc);
	}


	boolean isGraduateEligible( ) {						//override isGraduateEligible( )
		
		if (totalpassedcredit >= 132 )
		return true; 		//of the superclass
		else {
		return false;
		}
	}


}
