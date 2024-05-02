package com.cmwemployeemanagement.cmw.employee.management.model.entity;

import com.cmwemployeemanagement.cmw.employee.management.constant.Building;
import com.cmwemployeemanagement.cmw.employee.management.constant.Location;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "t_attendance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "date",nullable = false)
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "building",nullable = false)
    private Building building;

    @Enumerated(EnumType.STRING)
    @Column(name = "location",nullable = false)
    private Location location;

    @ManyToOne
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "employee-id",nullable = false)
    private Employee employee;

    @ManyToOne
    @JsonBackReference
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "schedule-id",nullable = false)
    private Schedule schedule;
}
