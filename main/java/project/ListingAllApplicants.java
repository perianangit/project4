package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListingAllApplicants {
public static void listingallapplicants() throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	String user="user";
	String query = "SELECT name FROM revapergce WHERE user_Admin='"+user+"' ";
	Statement st = (Statement) connection.createStatement();
	ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
	String user1 = null;
	System.out.println("All Applicants are......");
	while(rs.next())
	{
	user1=rs.getString("name");
	System.out.println(user1);
	}
}
}
