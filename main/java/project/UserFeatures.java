package project;
import java.util.Scanner;


public class UserFeatures {
	public static void featuresuser() throws Exception {
		Scanner obj4=new Scanner(System.in);
		System.out.println("select 1 for selecting ECE department");
		System.out.println("select 2 for selecting EEE department");
		System.out.println("select 3 for selecting MECH department");
		System.out.println("select 4 for selecting CS department");
		System.out.println("select 5 for selecting CICIL department");
		int user_DEPT=obj4.nextInt();
		String a = null;
		if(user_DEPT==1)
		{
			a="ECE";
		}
		else if(user_DEPT==2)
		{
			a="EEE";
		}
		else if(user_DEPT==3)
		{
		      a="MECH";	
		}
		else if(user_DEPT==4)
		{
			a="CS";
		}
		else if(user_DEPT==5)
		{
			a="CIVIL";
		}
		String email=Loginmail.getEmail();
		
		String query3="UPDATE revapergce SET user_Admission_Status='"+a+"' WHERE user_email='"+email+"' ";
		Registerinsertion.runquery(query3);
		System.out.println("DEPT..."+a+"email"+email);
		
			
	}

      
}
