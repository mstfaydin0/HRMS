package com.mstfaydin.hrms.business.concretes;

import com.mstfaydin.hrms.business.abstracts.StaffService;
import com.mstfaydin.hrms.business.abstracts.UserService;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.core.utilities.results.SuccessResult;
import com.mstfaydin.hrms.dataAccess.abstracts.EmployerDao;
import com.mstfaydin.hrms.dataAccess.abstracts.StaffDao;
import com.mstfaydin.hrms.entities.abstracts.User;
import com.mstfaydin.hrms.entities.concretes.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffManager implements UserService, StaffService
{
    private StaffDao staffDao;
    @Autowired
    public StaffManager(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public List<Staff> getAllUsers() {
        return this.staffDao.findAll();
    }

    @Override
    public Result add(Staff staff) {
        this.staffDao.save(staff);
        return new SuccessResult("Staff added");
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
