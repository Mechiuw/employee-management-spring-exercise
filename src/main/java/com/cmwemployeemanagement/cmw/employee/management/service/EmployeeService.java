package com.cmwemployeemanagement.cmw.employee.management.service;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Employee;
import com.cmwemployeemanagement.cmw.employee.management.model.request.EmployeeRequest;
import com.cmwemployeemanagement.cmw.employee.management.model.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest employeeRequest);

    List<Employee> getAll();

    EmployeeResponse getById(String id);

    EmployeeResponse update(String id,EmployeeRequest employeeRequest);

    void delete(String id);
}
