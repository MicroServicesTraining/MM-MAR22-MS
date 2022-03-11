/**
 * 
 */
package com.mm.sb.crud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mm.sb.crud.db.EmployeeDb;
import com.mm.sb.crud.model.Employee;

/**
 * @author ADMIN
 *
 */
@Repository
public class EmployeeRepository {

	@Autowired
	private EmployeeDb employeeDb;

	public List<Employee> selectAll() {
		return employeeDb.selectAll();
	}
	
	public Employee save(Employee employee) {
		return employeeDb.insert(employee);
	}
	
	public Employee modify(Employee employee) {
		return employeeDb.update(employee);
	}
	
	public Employee remove(Long id) {
		return employeeDb.delete(id);
	}

}
