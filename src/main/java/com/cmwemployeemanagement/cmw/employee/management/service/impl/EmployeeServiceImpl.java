package com.cmwemployeemanagement.cmw.employee.management.service.impl;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Employee;
import com.cmwemployeemanagement.cmw.employee.management.model.request.EmployeeRequest;
import com.cmwemployeemanagement.cmw.employee.management.model.response.EmployeeResponse;
import com.cmwemployeemanagement.cmw.employee.management.repository.EmployeeRepository;
import com.cmwemployeemanagement.cmw.employee.management.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponse create(EmployeeRequest employeeRequest) {
        Employee employee = Employee.builder()
                .firstName(employeeRequest.getFirstName())
                .lastName(employeeRequest.getLastName())
                .dateOfBirth(employeeRequest.getDateOfBirth())
                .address(employeeRequest.getAddress())
                .email(employeeRequest.getEmail())
                .phoneNum(employeeRequest.getPhoneNum())
                .domicile(employeeRequest.getDomicile())
                .idNum(employeeRequest.getIdNum())
                .emergencyNum(employeeRequest.getEmergencyNum())
                .gender(employeeRequest.getGender())
                .department(employeeRequest.getDepartment())
                .position(employeeRequest.getPosition())
                .build();
        employeeRepository.save(employee);
        return EmployeeResponse.builder()
                .firstName(employee.getFirstName())
                .email(employee.getEmail())
                .phoneNum(employee.getPhoneNum())
                .department(employee.getDepartment())
                .position(employee.getPosition())
                .build();
    }

    @Override
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeResponse getById(String id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        assert employee != null;
        return EmployeeResponse.builder()
                .firstName(employee.getFirstName())
                .email(employee.getEmail())
                .phoneNum(employee.getPhoneNum())
                .department(employee.getDepartment())
                .position(employee.getPosition())
                .build();
    }

    @Override
    public EmployeeResponse update(String id, EmployeeRequest employeeRequest) {
        if(getById(id) != null){
            Employee employee = Employee.builder()
                    .firstName(employeeRequest.getFirstName())
                    .lastName(employeeRequest.getLastName())
                    .dateOfBirth(employeeRequest.getDateOfBirth())
                    .address(employeeRequest.getAddress())
                    .email(employeeRequest.getEmail())
                    .phoneNum(employeeRequest.getPhoneNum())
                    .domicile(employeeRequest.getDomicile())
                    .idNum(employeeRequest.getIdNum())
                    .emergencyNum(employeeRequest.getEmergencyNum())
                    .gender(employeeRequest.getGender())
                    .department(employeeRequest.getDepartment())
                    .position(employeeRequest.getPosition())
                    .build();
            employeeRepository.save(employee);
            return EmployeeResponse.builder()
                    .firstName(employee.getFirstName())
                    .email(employee.getEmail())
                    .phoneNum(employee.getPhoneNum())
                    .department(employee.getDepartment())
                    .position(employee.getPosition())
                    .build();
        }
        return null;
    }

    @Override
    public void delete(String id) {
        employeeRepository.deleteById(id);
    }
}
