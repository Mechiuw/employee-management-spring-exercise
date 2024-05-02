package com.cmwemployeemanagement.cmw.employee.management.model.entity;

import com.cmwemployeemanagement.cmw.employee.management.constant.Gender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "m_employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employee {

    // personal
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "first-name",nullable = false)
    private String firstName;

    @Column(name = "last-name")
    private String lastName;

    @Column(name = "date-of-birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "phone-number", nullable = false)
    private String phoneNum;

    @Column(name = "domicile", nullable = false)
    private String domicile;

    @Column(name = "id-number", nullable = false)
    private String idNum;

    @Column(name = "emergency-contact", nullable = false)
    private String emergencyNum;

    //enum
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;


    // company

    //joins
    @ManyToOne
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(referencedColumnName = "id", name = "department-id")
    private Department department;

    @OneToOne
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "position-id",referencedColumnName = "id")
    private Position position;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Attendance> attendanceList;
}
