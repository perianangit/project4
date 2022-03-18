package project;

public class UserRegistration {
public String Name;
public String userOrAdmin;
public String userMobileNumber;
public int userAge;
public int userYearOfStudy;
public float userMark;
public String useremail;
public String userPassword;
public String user_Admission_Status;
public String user_Branch;
public UserRegistration(String Name,String userOrAdmin,String userMobileNumber,int userAge,int userYearOfStudy,float userMark,String useremail,String userPassword, String user_Admission_Status, String user_Branch)
{
	this.Name=Name;
	this.userOrAdmin=userOrAdmin;
	this.userMobileNumber=userMobileNumber;
	this.userAge=userAge;
	this.userYearOfStudy=userYearOfStudy;
	this.userMark=userMark;
	this.useremail=useremail;
	this.userPassword=userPassword;
	this.user_Admission_Status=user_Admission_Status;
	this.user_Branch=user_Branch;
}
}
