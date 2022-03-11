/**
 * 
 */
package com.mm.sb.crud.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mm.sb.crud.model.Employee;

/**
 * @author ADMIN
 *
 */
@Component
public class EmployeeDb {

	private List<Employee> employees;
	
	public EmployeeDb() {
		employees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1001L);
		emp1.setName("Kalyan");
		emp1.setDesignation("SSE");
		emp1.setSalary(25000.00);
		employees.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(1002L);
		emp2.setName("Pavan");
		emp2.setDesignation("SE");
		emp2.setSalary(20000.00);
		employees.add(emp2);
	}
	
	public List<Employee> selectAll(){
		return employees;
	}
	
	public Employee insert(Employee employee) {
		employee.setId((Long)Math.round((Math.random()*10000)));
		employees.add(employee);
		return employee;
	}
	
	public Employee update(Employee employee) {
			delete(employee.getId());
			employees.add(employee);		
		return employee;
	}

	public Employee delete(Long id) {
		Employee empInDb = findById(id);
		if(empInDb != null) {
			Iterator<Employee> it = employees.iterator();
			while(it.hasNext()) {
				Employee emp = it.next();
				if(emp.getId() == id) {
					it.remove();
					break;
				}
			}
		}
		return empInDb;
	}
	
	public Employee findById(Long id) {
		for(Employee e : employees) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
}
