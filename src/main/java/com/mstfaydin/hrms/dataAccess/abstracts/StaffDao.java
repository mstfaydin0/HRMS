package com.mstfaydin.hrms.dataAccess.abstracts;

import com.mstfaydin.hrms.entities.concretes.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<Staff,Long> {
}
