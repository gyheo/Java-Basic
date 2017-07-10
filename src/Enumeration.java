
public class Enumeration {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = Enumeration.MALE;
		gender1 = Enumeration.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
//		gender2 = Gender.girl;
	}

}

enum Gender {
	MALE, FEMALE;
}