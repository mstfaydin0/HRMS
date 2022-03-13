package com.mstfaydin.hrms.api.controllers;

import com.mstfaydin.hrms.business.abstracts.StaffService;
import com.mstfaydin.hrms.core.utilities.results.Result;
import com.mstfaydin.hrms.entities.concretes.Employer;
import com.mstfaydin.hrms.entities.concretes.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffsController {
    private StaffService staffService;
    @Autowired
    public StaffsController(StaffService staffService) {
        this.staffService = staffService;
    }
    @GetMapping("/getall")
    public List<Staff> getALL(){
        return this.staffService.getAllUsers();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Staff staff){
        return this.staffService.add(staff);
    }
}
