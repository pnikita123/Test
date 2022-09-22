package jdbcex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	Connection con;
	Statement stmt;
	ResultSet rSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getMyConnection();
		
		}
        
	public void getData() throws SQLException {
		stmt=con.createStatement();
		rSet=stmt.executeQuery("select * from contact");
		while(rSet.next()) {
			System.out.print(rSet.getInt(1) + "\t");
			System.out.print(rSet.getString(2) + "\t");
			System.out.print(rSet.getString(3) + "\t");
			System.out.println();
		}
		stmt.close();
		con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		StatementEx st=new StatementEx();
		st.getData();
	}

}
