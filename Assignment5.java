package week3.day1;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str3 = new String ("Kutty");
       String str4 = new String ("Kutty");
       if(str3==str4) {
    	   System.out.println("Same Text");
       }
       else
    	   System.out.println("Diff Text");
	
	//justification we have to use equals() method instead operator
       if(str3.equals(str4)) {
    	   System.out.println("Same Text");
       } else
    		   System.out.println("different Text");
       }
}
