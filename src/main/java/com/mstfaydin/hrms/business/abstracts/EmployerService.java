package com.mstfaydin.hrms.business.abstracts;

import com.mstfaydin.hrms.core.utilities.results.DataResult;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAllUsers();
    Result add(Employer employer);
}
