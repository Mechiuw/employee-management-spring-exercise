package com.cmwemployeemanagement.cmw.employee.management.repository;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,String> {
}
