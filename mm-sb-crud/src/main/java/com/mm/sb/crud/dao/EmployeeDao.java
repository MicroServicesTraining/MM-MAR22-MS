/**
 * 
 */
package com.mm.sb.crud.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mm.sb.crud.model.Employee;

/**
 * @author ADMIN
 *
 */
public interface EmployeeDao {

	List<Employee> getAllEmployeesList();

}
