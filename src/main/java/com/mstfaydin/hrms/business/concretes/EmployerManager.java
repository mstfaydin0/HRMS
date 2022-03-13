package com.mstfaydin.hrms.business.concretes;

import com.mstfaydin.hrms.business.abstracts.EmployerService;
import com.mstfaydin.hrms.business.abstracts.UserService;
import com.mstfaydin.hrms.core.utilities.results.DataResult;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.core.utilities.results.SuccessDataResult;
import com.mstfaydin.hrms.core.utilities.results.SuccessResult;
import com.mstfaydin.hrms.dataAccess.abstracts.EmployerDao;
import com.mstfaydin.hrms.entities.abstracts.User;
import com.mstfaydin.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements UserService, EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao=employerDao;
    }


    @Override
    public DataResult<List<Employer>> getAllUsers() {
        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(),"Data listed");

    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Employer added");
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
