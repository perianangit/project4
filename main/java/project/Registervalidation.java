package project;

public class Registervalidation {

	public static void validatingRegistration(UserRegistration car) throws Exception {
		int isNameValid=nameValidation(car.Name);
		int isUserOrAdminValid=userOrAdminValidation(car.userOrAdmin);
		int isMobileValid=userMobileNumberValidation(car.userMobileNumber);
		int isAgeValid=userAgeValidation(car.userAge);
		int isuserYearOfStudyValid=userYearOfStudyValidation(car.userYearOfStudy);
		int isuserMarkValid=userMarkValidation(car.userMark);
		int isEmailValid=userEmailValidation(car.useremail);
		int isPasswordValid=userPasswordValidation(car.userPassword);
		if(isNameValid+isUserOrAdminValid+isMobileValid+isAgeValid+isuserYearOfStudyValid+isuserMarkValid+isEmailValid+isPasswordValid==8)
		{
			System.out.println("Welcome");
			Registerinsertion.insertUser(car);
			}
			else
			{
			throw new Exception("Please Re-Enter Your Details");
			}
			}
				public static int nameValidation(String Name) throws Exception{
					if(Name!=null) {
						return 1;
					}
					else
					{
						throw new Exception("enter a valid name");
					}
				}
				public static int userOrAdminValidation(String userOrAdmin)throws Exception{
					if(userOrAdmin.equals("user")||userOrAdmin.equals("admin")) {
						return 1;
					}
					else {
						throw new Exception("enter user or admin alone");
					}
				}
	            public static int userMobileNumberValidation(String userMobileNumber )throws Exception{
	            	char[] mobile=userMobileNumber.toCharArray();
	            	if(mobile.length==10) {
	            		for(char i:mobile) {
	            			
	            			if(Character.isAlphabetic(i))
	            			{
	            				throw new Exception("enter only numeric values");
	            			}
	            		}
	            	}
					return 1;
	            }
		
		public static int userAgeValidation(int userAge)throws Exception
		{
			if(userAge<0)
			{
				throw new Exception("enter a valid age");
			}
			else
			{
				return 1;
			}
		}
		public static int userYearOfStudyValidation(int userYearOfStudy)throws Exception
		{
			if(userYearOfStudy==1||userYearOfStudy==2||userYearOfStudy==3||userYearOfStudy==4)
			{
				return 1;
			}
			else
			{
				throw new Exception("enter a valid year");
			}
		}
		public static int userMarkValidation(float userMark)throws Exception
		{
			if(userMark<=100||userMark>0)
			{
				return 1;
			}
			else
			{
				throw new Exception("enter a valid mark");
			}
		}
	   public static int userEmailValidation(String useremail)throws Exception
	  {
		  if(useremail.contains("@"))
		  {
			  return 1;
		  }
		  else
		  {
			  throw new Exception("enter valid email id");
		  }
	  }
	   public static int userPasswordValidation(String userPassword)throws Exception
	   {
		   if(userPassword.length()<8) {
			   return 1;
		   }
		   else
		   {
			   throw new Exception("enter a valid password");
		   }
	   }
	   
			}
