package project;

public class loginValidation {
public static void loginValidator(loginregistration pen)throws Exception
{
	int isemailValid=emailValidation(pen.email);
	int ispasswordValid=passwordValidation(pen.password);
	if(isemailValid+ispasswordValid==2)
	{
		System.out.println("welcome...!!!");
	}
	else
	{
		throw new Exception("enter valid login details");
	}
}
 public static int emailValidation(String email)throws Exception
 {
	 if(email.contains("@"))
	 {
		 return 1;
	 }
	 else
	 {
		 throw new Exception("enter valid email");
	 }
 }
 public static int passwordValidation(String password)throws Exception
 {
	 if(password.length()<8) 
	 {
		return 1; 
	 }
	 else
	 {
		throw new Exception("enter valid password"); 
	 }
 }

}
