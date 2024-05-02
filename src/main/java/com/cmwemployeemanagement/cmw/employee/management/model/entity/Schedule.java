package com.cmwemployeemanagement.cmw.employee.management.model.entity;

import com.cmwemployeemanagement.cmw.employee.management.constant.WorkHour;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "m_schedule")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "schedule-name", nullable = false)
    private String scheduleName;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "work-hour", nullable = false)
    private WorkHour workHour;

    @OneToMany(mappedBy = "schedule",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Attendance> attendances;
}
