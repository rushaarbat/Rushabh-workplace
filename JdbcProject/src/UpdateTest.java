import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
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
			
			System.out.println("For which dept number : ");
			int dummyDeptno = scan1.nextInt();
			

			System.out.println("Enter NEW dept name : ");
			String dummyDeptName = scan2.nextLine();

			System.out.println("Enter NEW dept location  : ");
			String dummyDeptLoc = scan3.nextLine();
			
			
			
			//3. - decide your statement   DQL / DML / PLSQL
			PreparedStatement pst = conn.prepareStatement("update dept set dname=?, loc=? where deptno=?");;
			
			pst.setInt(3, dummyDeptno);
			
			pst.setString(1, dummyDeptName);
			pst.setString(2, dummyDeptLoc);
			
			int rows = pst.executeUpdate();
			System.out.println("Row updated : "+rows);
			
			
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