import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		try {
			//1 - registration of Driver
  DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");
			
			//2 - establish the connection
  Connection conn = DriverManager.getConnection(
				"jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected...."+conn);
			
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			
			System.out.println("Enter dept number : ");
			int dummyDeptno = scan1.nextInt();
			

			System.out.println("Enter dept name : ");
			String dummyDeptName = scan2.nextLine();

			System.out.println("Enter dept location  : ");
			String dummyDeptLoc = scan3.nextLine();
			
			
			
			//3. - decide your statement   DQL / DML / PLSQL
			PreparedStatement pst = conn.prepareStatement("insert into dept values (?,?,?)");;
			pst.setInt(1, dummyDeptno);
			pst.setString(2, dummyDeptName);
			pst.setString(3, dummyDeptLoc);
			int rows = pst.executeUpdate();
			System.out.println("Row created : "+rows);
			
			
			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
/*
  		
 									Driver <-- interface java.sql
  										|6 method
  										|
  DRIVER 	- 	org.hsqldb.jdbc.JDBCDriver
  URL 		-	jdbc:hsqldb:hsql://localhost/mydb
  USERNAME  -   SA
  PASSWORD  -



	JDBC - Java Database Connectivity

					DriverManager
						- void registerDriver(Driver)
					Connection getConnection("url","SA","")
						| * connection is not the parent here
			--------------------------
			|			|			|
		Statement PreparedStatement CallableStatement
		|				|				|
	select		insert/update/delete	procedure/function
			
			
			
			
							

*/