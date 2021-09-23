package week3.day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student ID:" + id );
}
public void getStudentInfo(int id, String name) {
	System.out.println("Student ID:" + id );
	System.out.println("Student Name"+name);
}
public void getStudentInfo(String email, String number) {
	System.out.println("Email:"+email);
	System.out.println("Mobile Number:"+ number);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Students a = new Students();
      a.getStudentInfo(2434);
      a.getStudentInfo(2434,"venkat");
	  a.getStudentInfo("venkat@gmail.com", "9798888978");
	}

}
