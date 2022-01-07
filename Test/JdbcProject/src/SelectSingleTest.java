import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectSingleTest {
	public static void main(String[] args) throws DepartmentNotFoundException
	{
		try {
			//1 - registration of Driver
  DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");
			
			//2 - establish the connection
  Connection conn = DriverManager.getConnection(
				"jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected...."+conn);
			
			//3. - decide your statement   DQL / DML / PLSQL
			Statement st = conn.createStatement();
			
			//4 - run the query and acquire the result
			
			System.out.println("Which dept number to search ? ");
			Scanner scan = new Scanner(System.in);
			int dummyDeptno = scan.nextInt();
			
			ResultSet result2 = st.executeQuery("select * from dept where deptno="+dummyDeptno);
			
			
			//5 - process the result 
			if( result2.next() ) {
				int dno = result2.getInt(1);
				String dnm = result2.getString(2);
				String loc = result2.getString(3);
				System.out.println("NUMBER    : "+dno);
				System.out.println("STRING1   : "+dnm);
				System.out.println("STRING2   : "+loc);
				System.out.println("--------------------");
			} else {
				
				//System.out.println("Department not found....");
				//throw new RuntimeException ("Department NOT found "+dummyDeptno);
				throw new DepartmentNotFoundException("Department Does not exists!!!"+dummyDeptno);
				
			}
			
			result2.close();
			st.close();
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