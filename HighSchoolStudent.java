
public class HighSchoolStudent extends Student {


	HighSchoolStudent(String firstname, String lastname) {
		super(firstname,lastname);
	}
	
	HighSchoolStudent(String firstname, String lastname, String address, String city,
			String state, String email, String etc) {
		super(firstname,lastname,address,city,state,email,etc);
	}


	boolean isGraduateEligible( ) {						//override isGraduateEligible( )
		
		if (totalpassedcourse >= 24 )
		return true; 		//of the superclass
		else {
		return false;
		}
	}


}
