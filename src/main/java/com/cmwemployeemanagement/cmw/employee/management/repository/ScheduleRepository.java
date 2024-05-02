package com.cmwemployeemanagement.cmw.employee.management.repository;

import com.cmwemployeemanagement.cmw.employee.management.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,String> {
}
