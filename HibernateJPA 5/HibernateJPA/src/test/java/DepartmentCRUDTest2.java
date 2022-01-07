import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.dao.DepartmentDAO;
import com.java.dao.impl.DepartmentDAOImpl;
import com.java.entity.Department;

public class DepartmentCRUDTest2 {
	
	DepartmentDAO deptDAO = new DepartmentDAOImpl();
	
	@Test
	public void insertDeptTest() {	
			Department dept = new Department(); //new/blank entity object 
			dept.setDepartmentNumber(50); //these values might come from angular UI form
			dept.setDepartmentName("Hibernate");
			dept.setDepartmentLocation("2nd DAY");
			deptDAO.insertDepartment(dept);
	}
	
	@Test
	public void selectDeptTest() {
			Department dept = deptDAO.selectDepartment(50);
		Assertions.assertNotNull(dept);
			System.out.println("Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Dept Name     : "+dept.getDepartmentName());
			System.out.println("Dept Location : "+dept.getDepartmentLocation());
	}

	@Test
	public void selectAllDeptTest() {
		List<Department> deptList = deptDAO.selectAllDepartments();
		Assertions.assertNotNull(deptList);
		Assertions.assertTrue(deptList.size()>0); 
			for(Department dept : deptList ) {
				System.out.println("Dept Number   : "+dept.getDepartmentNumber());
				System.out.println("Dept Name     : "+dept.getDepartmentName());
				System.out.println("Dept Location : "+dept.getDepartmentLocation());
			}
	}

	@Test
	public void updateDeptTest() {
			Department dept = new Department();
			dept.setDepartmentNumber(50);
			dept.setDepartmentName("FinalTest");
			dept.setDepartmentLocation("Mumbai");
	
			System.out.println("Current Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Current Dept Name     : "+dept.getDepartmentName());
			System.out.println("Current Dept Location : "+dept.getDepartmentLocation());
	
			deptDAO.updateDepartment(dept);

	}
	
	@Test
	public void deleteDeptTest() { 

			Department dept = deptDAO.deleteDepartment(50);
			Assertions.assertNotNull(dept);
			System.out.println("Current Dept Number   : "+dept.getDepartmentNumber());
			System.out.println("Current Dept Name     : "+dept.getDepartmentName());
			System.out.println("Current Dept Location : "+dept.getDepartmentLocation());
	
	}
  
}
