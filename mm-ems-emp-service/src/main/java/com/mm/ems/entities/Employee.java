/**
 * 
 */
package com.mm.ems.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author dorak
 *
 */
@Entity
@Table(name = "employee")
/*@NamedQueries({
	//@NamedQuery(name = "Employee.getEmpWithPartname", query = "SELECT emp FROM Employee emp WHERE emp.name LIKE :partName"),
	@NamedQuery(query = "SELECT emp FROM Employee emp WHERE emp.salary > :minSal  and emp.salary < :maxSal", name = "Employee.getEmpWithSalaryRange")
})*/
@NamedNativeQueries(value = {
	@NamedNativeQuery(name = "Employee.getEmpWithSalaryRange", query = "SELECT * FROM employee  WHERE esal > :minSal  and esal < :maxSal", resultClass = Employee.class)
})
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5184961285230906257L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private Long id;
	
	@Column(name = "ename")
	private String name;
	
	@Column(name = "eaddr")
	private String address;
	
	@Column(name = "esal")
	private Double salary;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
