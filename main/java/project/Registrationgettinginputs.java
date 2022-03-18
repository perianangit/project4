package project;
import java.util.Scanner;
public class Registrationgettinginputs {
	 static Scanner sc = new Scanner(System.in);
	   public static void registrationgettinginputs(){
		   System.out.println("Enter your name");
		   String Name=sc.next();
		   System.out.println("enter 'user' or 'admin' ");
		   String userOrAdmin=sc.next();
		   System.out.println("Enter your mobile number ");
		   String userMobileNumber=sc.next();
		   System.out.println("enter your age");
		   int userAge=sc.nextInt();
		   System.out.println("Enter the year of study(mention it as 1 or 2 or 3 or 4)");
		   int userYearOfStudy=sc.nextInt();
		   System.out.println("Enter your mark");
		   float userMark=sc.nextFloat();
		   System.out.println("enter your E-mail ID");
		   String useremail=sc.next();
		   System.out.println("enter your password");
		   String userPassword=sc.next();
		   String  user_Admission_Status="pending";
		   String user_Branch="not selected";
		   UserRegistration car=new UserRegistration(Name,userOrAdmin,userMobileNumber,userAge,userYearOfStudy,userMark,useremail,userPassword,user_Admission_Status,user_Branch);
		   try
		   {
			   Registervalidation .validatingRegistration(car);
		   }catch(Exception e)
		   {
			   System.out.println("error..!!"+e.getMessage());
		   }
	   }
public static void logininputs() throws Exception
{
	System.out.println("enter your email");
	String email=sc.next();
	System.out.println("enter your password");
	String password=sc.next();
	//loginregistration pen=new loginregistration(email,password);
	try
	{
	//loginValidation.loginValidator(pen);
	String mail=LoginValidationUsingDatabase.loginValidatorUsingDatabase(email,password);
	Loginmail.loginmail(mail);
	}catch(Exception e)
	{
		System.out.println("error..!!"+e.getMessage());
	}
	
	//AdminFeatures.featuresadmin();  
}
}