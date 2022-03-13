package com.mstfaydin.hrms.dataAccess.abstracts;

import com.mstfaydin.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Long> {
}
