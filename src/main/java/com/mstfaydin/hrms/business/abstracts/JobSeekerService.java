package com.mstfaydin.hrms.business.abstracts;

import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;
import com.mstfaydin.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService  {

    List<JobSeeker> getAllUsers();
    Result add(JobSeeker jobSeeker);

}
