package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Accceptorreject {
public static void acceptorreject() throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	
	String query = "SELECT user_Mark FROM revapergce ";
	Statement st = (Statement) connection.createStatement();
	ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
	float mark1 = 0;
	System.out.println(" Applicants status......");
	while(rs.next())
	{
		String a=null;
	mark1=rs.getFloat("user_Mark");
	if(mark1>=80)		
	{
		a="accepeted";	
	}
	else
	{
		a="denied";
	}
	String query2="UPDATE revapergce SET user_Admission_Status='"+a+"' WHERE user_mark='"+mark1+"' ";
	Registerinsertion.runquery(query2);	
	System.out.println(a);
	}
	}

}
