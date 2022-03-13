package com.mstfaydin.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name="company_name")
    private String companyName;

    @Column(name = "web_site")
    private String companyWebsite;

    @Column(name="phone")
    private String companyPhoneNumber;



}