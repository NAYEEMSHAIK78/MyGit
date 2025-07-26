package javaSQL;
import java.sql.DriverManager;
import java.sql.Connection;
public class DBUtil {
	static Connection con=null;
	static String url="jdbc:mysql://localhost/db1";
	static String uname="root";
	static String pass="Nay@9494";
	public static Connection getConnection() {
		try {
			con=DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
}
}