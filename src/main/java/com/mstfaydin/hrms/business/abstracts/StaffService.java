package com.mstfaydin.hrms.business.abstracts;


import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;
import com.mstfaydin.hrms.entities.concretes.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> getAllUsers();
    Result add(Staff staff);
}
