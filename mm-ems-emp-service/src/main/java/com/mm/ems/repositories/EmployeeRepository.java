/**
 * 
 */
package com.mm.ems.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mm.ems.entities.Employee;

/**
 * @author dorak
 *
 */
@Repository
/*@NamedQueries({
	@NamedQuery(name = "Employee.getEmpWithPartname", query = "SELECT emp FROM Employee emp WHERE emp.name LIKE %?1%"),
	@NamedQuery(name = "Employee.getEmpWithSalaryRange", query = "SELECT emp FROM Employee emp WHERE emp.salary > :minSal  and emp.salary < :maxSal")
})*/
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByName(String empName);

	List<Employee> findByAddress(String empAddress);
	
	@Query(value = "SELECT emp FROM Employee emp WHERE emp.name LIKE %?1%")
	List<Employee> findEmpWithPartname(String partName);
	//List<Employee> getEmpWithPartname(@Param(value = "partName") String partName);
	

	//@Query(value = "SELECT * FROM employee  WHERE esal > :minSal  and esal < :maxSal", nativeQuery = true)
	//@Query(value = "SELECT emp FROM Employee emp WHERE emp.salary > :minSal  and emp.salary < :maxSal")
	//List<Employee> findEmpWithSalaryRange(@Param(value = "minSal") Double minSalary, @Param(value = "maxSal") Double maxSalary);
	List<Employee> getEmpWithSalaryRange(@Param(value = "minSal") Double minSalary, @Param(value = "maxSal") Double maxSalary);

}
