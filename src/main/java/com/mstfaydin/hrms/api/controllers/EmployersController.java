package com.mstfaydin.hrms.api.controllers;

import com.mstfaydin.hrms.business.abstracts.EmployerService;
import com.mstfaydin.hrms.core.utilities.results.DataResult;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployersController {
    private EmployerService employerService;
    @Autowired
    public EmployersController(EmployerService employerService){
        this.employerService=employerService;
    }
    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAllUsers();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }


}
