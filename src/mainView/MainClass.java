package mainView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import view.LoginFrame;
import view.RegisterFrame;

public class MainClass {

	public static Connection main(String[] args) throws ClassNotFoundException, SQLException {
	
		//	new LoginFrame();
	
	String url="jdbc:sqlserver://DESKTOP-7RG21A7\\SQLEXPRESS;database=PCSDB";
	String username="sa";
	String password="sandy6849";
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection conn=DriverManager.getConnection(url,username,password);
	if (conn!= null)
	System.out.println("connected");
	return conn;
		
	
	}
}
