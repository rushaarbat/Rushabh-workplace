package com.java.dao;

import java.util.List;

import com.java.entity.Department;

public interface DepartmentDAO {
	//5 methods for CRUD - C R RA U D
	
	Department insertDepartment(Department dept);
	Department selectDepartment(int deptno);
	List<Department> selectAllDepartments();
	Department updateDepartment(Department dept);
	Department deleteDepartment(int deptno);
	
}
