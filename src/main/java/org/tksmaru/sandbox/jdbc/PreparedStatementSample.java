package org.tksmaru.sandbox.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.tksmaru.sandbox.jdbc.util.DBAccessor;

public class PreparedStatementSample {

	/**
	 * 
	 * @return
	 */
	public static void main(String [] args) throws Exception {
		
		Connection conn = DBAccessor.getConnection();
		
		// update 
		PreparedStatement pstmt = conn.prepareStatement("update status set status = 2 where id = 1 and status = 1");
		int updated = pstmt.executeUpdate();
		
		System.out.println("updated column num = " + updated);

		DBAccessor.closeStatement(pstmt);
		DBAccessor.closeConnection(conn);
	}
}
