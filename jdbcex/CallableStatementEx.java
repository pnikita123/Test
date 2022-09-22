package jdbcex;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementEx {
	
	Connection con;
	CallableStatement cStmt;
	
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getMyConnection();
		System.out.println("Connection get opened");
	}
	
	public void callingProcedure(int id,String userName) throws SQLException
	{
		cStmt=(CallableStatement) con.prepareCall("call insertRecord(?,?)");
		cStmt.setInt(1, id);
		cStmt.setString(1, userName);
		cStmt.execute();
		System.out.println("inserted successfully");

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		CallableStatementEx c1=new CallableStatementEx();
		c1.callingProcedure(101, "hina");
		
	}

}
