package configure;
import java.sql.*;

public class JdbcConfiguration {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{

		String url="jdbc:sqlserver://DESKTOP-7RG21A7\\SQLEXPRESS:1434;database=PCSDB";
		String username="sa";
		String password="sandy6849";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn=DriverManager.getConnection(url,username,password);
		return conn;
	}
}


