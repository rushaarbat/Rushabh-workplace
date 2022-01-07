package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Department;

@Repository
public class DepartmentRepositoryImpl extends BaseRepository implements DepartmentRepository {

	
	public DepartmentRepositoryImpl() {
			System.out.println("DepartmentRepositoryImpl ..");	
	}
	
	@Transactional
	public void insertDepartment(Department dobj) {
		
		super.persist(dobj); // invoking the dummy persist of the super class
		System.out.println("department inserted...");
	}

	@Override
	public Department selectDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentRepositoryImpl : selecting department by deptno");
		Department dept = super.find(Department.class, dno);
		
		return dept;
	}

	@Override
	public List<Department> selectDepartments() {
		List<Department>  deptList = new ArrayList<Department>();
	
			System.out.println("DepartmentRepositoryImpl : Selecting all departments...");
			return super.findAll("Department");
		
	}

	@Transactional
	public void updateDepartment(Department dobj) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentRepositoryImpl : Updating department...");
		super.merge(dobj);
	}

	@Transactional
	public void deleteDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentRepositoryImpl : Deleting department");
		super.remove(Department.class, dno);
	}

	

	

	

}
