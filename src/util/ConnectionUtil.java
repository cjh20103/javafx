package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static{

		try{
			Class.forName("oracle.jdbc.OracleDriver");

		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	/**
	 * 데이타베이스와 연결된 새로운 Connection 객체를 반환한다. * 
	 * @return Connection 객체
	 * @throws SQLException
	 */

	public static Connection getConnection()throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";

		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
