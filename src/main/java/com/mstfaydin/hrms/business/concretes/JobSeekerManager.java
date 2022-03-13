package com.mstfaydin.hrms.business.concretes;

import com.mstfaydin.hrms.business.abstracts.JobSeekerService;
import com.mstfaydin.hrms.business.abstracts.UserService;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.core.utilities.results.SuccessResult;
import com.mstfaydin.hrms.dataAccess.abstracts.EmployerDao;
import com.mstfaydin.hrms.dataAccess.abstracts.JobSeekerDao;
import com.mstfaydin.hrms.entities.abstracts.User;
import com.mstfaydin.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements UserService, JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public List<JobSeeker> getAllUsers() {
        return this.jobSeekerDao.findAll();
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("Job Seeker added");
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void login(User user) {

    }

    @Override
    public void logout(User user) {

    }
}
