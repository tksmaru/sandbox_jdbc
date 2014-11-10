package org.tksmaru.sandbox.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementSample {

	/**
	 * 
	 * @return
	 */
	public static void main(String [] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sandbox", "root", "root");
		
		System.out.println(conn);
		
		// update 
		PreparedStatement pstmt = conn.prepareStatement("update status set status = 2 where id = 1 and status = 1");
		
		int updated = pstmt.executeUpdate();
		
		System.out.println("updated column num = " + updated);

		pstmt.close();
		conn.close();
	}
}
