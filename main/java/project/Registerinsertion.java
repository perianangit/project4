package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Registerinsertion {
	public static void runquery(String query)throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//System.out.println(connection);
	//System.out.println(query);
	java.sql.Statement statement=connection.createStatement();
	int rows=statement.executeUpdate(query);
	//System.out.println(rows);
	connection.close();
	}
	public static void insertUser(UserRegistration obj) throws Exception 
	{
		String query1="insert into revapergce(name,user_Admin,user_MobileNumber,user_Age,user_YearOfStudy,user_Mark,user_email,user_Password,user_Admission_Status,user_Branch)values('"+ obj.Name+"','" +obj.userOrAdmin+"','"+obj.userMobileNumber +"','"+obj.userAge +"','"+obj.userYearOfStudy+"','"+obj.userMark+"','"+obj.useremail +"','"+obj.userPassword +"','"+obj.user_Admission_Status +"','"+obj.user_Branch +"')";
		System.out.println(query1);
		runquery(query1);
	}
}
