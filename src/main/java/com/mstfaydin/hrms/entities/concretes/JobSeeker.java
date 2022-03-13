package com.mstfaydin.hrms.entities.concretes;

import com.mstfaydin.hrms.entities.abstracts.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job_seekers")
public class JobSeeker extends User  {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_number")
    private String idenficitionNumber;

    @Column(name = "birth_date")
    private String birthDate;

    public JobSeeker() {
    }

    public JobSeeker(Long id, String email, String password, String firstName, String lastName, String idenficitionNumber, String birthDate) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idenficitionNumber = idenficitionNumber;
        this.birthDate = birthDate;
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

    public String getIdenficitionNumber() {
        return idenficitionNumber;
    }

    public void setIdenficitionNumber(String idenficitionNumber) {
        this.idenficitionNumber = idenficitionNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
