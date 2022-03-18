package project;
import java.util.Scanner;
public class AdminFeatures {
 public static void featuresadmin() throws Exception {
	 Scanner obj3=new Scanner(System.in);
	 System.out.println("select 1 for listing all applicants");
	 System.out.println("select 2 for approve or reject application ");
	 System.out.println("select 3 for view application");
	 System.out.println("select 4 for searching by dept");
	 System.out.println("select 5 for add dept");
	 System.out.println("select 6 for delete dept");
	 System.out.println("select 7 for adding fees details");
	 System.out.println("select 8 for updating fees details");
	  int  adminuse=obj3.nextInt();
	 if(adminuse==1)
	 {
		 ListingAllApplicants.listingallapplicants();
	 }
	 else if(adminuse==2)
	 {
		 
	 }
	 else if(adminuse==3) 
	 {
		 
	 }
	 else if(adminuse==4)
	 {
		 
	 }
 }
}
