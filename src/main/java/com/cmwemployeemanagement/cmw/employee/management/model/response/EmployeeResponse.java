package com.cmwemployeemanagement.cmw.employee.management.model.response;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Department;
import com.cmwemployeemanagement.cmw.employee.management.model.entity.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResponse {
    private String firstName;
    private String email;
    private String phoneNum;
    private Department department;
    private Position position;
}
