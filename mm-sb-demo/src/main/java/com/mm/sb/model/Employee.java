/**
 * 
 */
package com.mm.sb.model;

/**
 * @author ADMIN
 *
 */
public class Employee {

	private Long id;
	private String name;
	private String role;
	private Double salary;
	
	public Employee() {}
	
	/**
	 * @param id
	 * @param name
	 * @param role
	 * @param salary
	 */
	public Employee(Long id, String name, String role, Double salary) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
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
