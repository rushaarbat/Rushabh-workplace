package com.example.demo.layer2;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp6")
public class Employee
{
	@Id
	@Column(name="EMPNO")
	private int empNumber;
	
	
	@Column(name="ENAME")
	private String empName;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="MGR")
	private Integer mgr;
	
	@Column(name="HIREDATE")
	private LocalDate hiredate;
	
	@Column(name="SAL")
	private Float salary;
	
	
	@Column(name="COMM")
	private Float comm;
	
	@ManyToOne
	@JoinColumn(name="DEPTNO") /c
	private Department dept;   //make depatment obj 
	                           //has a
	
	public int getEmpNumber() {
		return empNumber;
	}


	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Integer getMgr() {
		return mgr;
	}


	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}


	public LocalDate getHiredate() {
		return hiredate;
	}


	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}


	public Float getComm() {
		return comm;
	}


	public void setComm(Float comm) {
		this.comm = comm;
	}

	
}
