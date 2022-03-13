package com.mstfaydin.hrms.entities.concretes;


import com.mstfaydin.hrms.entities.abstracts.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="staff")

public class Staff extends User  {
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identification_number")
    private int identificatioNumber;

    @Column(name="birth_date")
    private String birtDate;

    @Column(name="job_position")
    private String jobPosition;

    public Staff(Long id, String email, String password, String firstName, String lastName, int identificatioNumber, String birtDate, String jobPosition) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificatioNumber = identificatioNumber;
        this.birtDate = birtDate;
        this.jobPosition = jobPosition;
    }

    public Staff() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdentificatioNumber() {
        return identificatioNumber;
    }

    public void setIdentificatioNumber(int identificatioNumber) {
        this.identificatioNumber = identificatioNumber;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}
