package com.cmwemployeemanagement.cmw.employee.management.model.request;

import com.cmwemployeemanagement.cmw.employee.management.constant.Gender;
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
public class EmployeeRequest {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String email;
    private String phoneNum;
    private String domicile;
    private String idNum;
    private String emergencyNum;
    private Gender gender;
    private Department department;
    private Position position;
}
