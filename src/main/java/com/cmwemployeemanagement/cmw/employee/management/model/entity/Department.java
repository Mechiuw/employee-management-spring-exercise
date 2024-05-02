package com.cmwemployeemanagement.cmw.employee.management.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "m_department")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "department",nullable = false)
    private String nameDepartment;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    @JsonManagedReference
    private List<Employee> employeeList;
}
