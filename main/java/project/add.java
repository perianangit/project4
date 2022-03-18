package project;
import java.util.Scanner;
public class add {
 public static void Add(){
	 System.out.println("enter the number1");
	 Scanner obj=new Scanner(System.in);
	 int  a=obj.nextInt();
	 System.out.println("enter the number2");
	 int  b=obj.nextInt();
	 int c=a+b;
	 System.out.println("c is sum"+c);
 }
}
