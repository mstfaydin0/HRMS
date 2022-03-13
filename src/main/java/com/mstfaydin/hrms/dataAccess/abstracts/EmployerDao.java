package com.mstfaydin.hrms.dataAccess.abstracts;

import com.mstfaydin.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Long> {
}
