package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDatabaseEx1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

		//register driver
		Class.forName(" com.mysql.jdbc.Driver");
		
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/afternoonbatch", "root", "Panhale@123");
		
		//create Statement
		Statement statement=con.createStatement();
		
		//execute Statement
		ResultSet rSet=statement.executeQuery("select * from contact");
        
		//retrive the result
		while(rSet.next()) {
			System.out.print(rSet.getInt("contact_id") + "\t");
			System.out.print(rSet.getString("persone_name") + "\t");
			System.out.print(rSet.getString("phone_no") + "\t");
			System.out.println();
		}
		//close the connection
		statement.close();
		con.close();
		
		}

}
