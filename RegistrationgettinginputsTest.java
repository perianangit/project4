package project;
import java.util.Scanner;
public class RegistrationgettinginputsTest {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter your option");
		int option =sc.nextInt();                                     //enter option register or login
		if(option==1)
		{
			Registrationgettinginputs.registrationgettinginputs();
		}
		else if(option==2)
		{
			Registrationgettinginputs.logininputs();
		}
			
	}

}
