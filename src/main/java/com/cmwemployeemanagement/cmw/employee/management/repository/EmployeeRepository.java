package com.cmwemployeemanagement.cmw.employee.management.repository;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
