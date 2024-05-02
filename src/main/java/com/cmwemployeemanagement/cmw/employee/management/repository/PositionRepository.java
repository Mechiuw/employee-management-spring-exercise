package com.cmwemployeemanagement.cmw.employee.management.repository;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,String> {
}
