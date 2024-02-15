package api;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBconnection {
	
	static Connection myConn = null;
	static Statement myStamt = null;
	static ResultSet myRes = null;
	
	
	public static void DBconnection() {
		
	try {
		System.out.println("Genial, nos conectamos!!");
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria","root","Admin2016");
	
		myStamt= myConn.createStatement();
		myRes = myStamt.executeQuery("SELECT * FROM empleado");
		while(myRes.next()) {
			System.out.println(myRes.getString("nombre"));
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Algo ha salido mal :(, Espabila");
		throw new RuntimeException(e);
	};
	
	};
	
	public static void Test() {
	System.out.println("Hi, I'm here ;)");
	}
}
