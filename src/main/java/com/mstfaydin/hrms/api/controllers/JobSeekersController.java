package com.mstfaydin.hrms.api.controllers;

import com.mstfaydin.hrms.business.abstracts.JobSeekerService;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;
import com.mstfaydin.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekersController {
    private JobSeekerService jobSeekerService;
    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    @GetMapping("/getall")
    public List<JobSeeker> getALL(){
        return this.jobSeekerService.getAllUsers();
    }
    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }

}
