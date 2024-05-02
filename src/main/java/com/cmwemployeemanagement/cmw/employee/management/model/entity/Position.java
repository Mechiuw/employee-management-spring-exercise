package com.cmwemployeemanagement.cmw.employee.management.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "m_position")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "position", nullable = false)
    private String positionName;

    @Column(name = "salary", nullable = false)
    private Long salary;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(mappedBy = "position",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Employee employee;
}
