package com.cmwemployeemanagement.cmw.employee.management.controller;

import com.cmwemployeemanagement.cmw.employee.management.constant.EndPointApp;
import com.cmwemployeemanagement.cmw.employee.management.model.entity.Employee;
import com.cmwemployeemanagement.cmw.employee.management.model.request.EmployeeRequest;
import com.cmwemployeemanagement.cmw.employee.management.model.response.EmployeeResponse;
import com.cmwemployeemanagement.cmw.employee.management.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(EndPointApp.EMPLOYEE)
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public EmployeeResponse create(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.create(employeeRequest);
    }
    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/{id}")
    public EmployeeResponse getById(@PathVariable String id){
        return employeeService.getById(id);
    }
    @PutMapping
    public EmployeeResponse update(@PathVariable String id,@RequestBody EmployeeRequest employeeRequest){
        return employeeService.update(id,employeeRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        employeeService.delete(id);
    }

}
