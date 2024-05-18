package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public class PatientTO implements Serializable{
    
    private Long id;
	private String firstName;


	private String lastName;

    private String telephoneNumber;

	private String email;


	private String patientNumber;

	private LocalDate dateOfBirth;

    private AddressEntity addressEntity;

    private DoctorEntity doctorEntity;

    public DoctorEntity getDoctorEntity() {
        return this.doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity) {
        this.doctorEntity = doctorEntity;
    }

    public AddressEntity getAddressEntity() {
        return this.addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    private List<VisitEntity> visitEntity;
    
    // public List<VisitEntity> getVisitEntity() {
    //     List<VisitEntity> visitsWithDoctor = new ArrayList<>();
    //     for (VisitEntity visit : visitEntity) {
    //         visitsWithDoctor.add(new VisitEntity(visit, visit.()));
    //     }
    //     return visitsWithDoctor;
    // }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientNumber() {
        return this.patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<VisitEntity> getVisitEntity() {
        return this.visitEntity;
    }

    public void setVisitEntity(List<VisitEntity> visitEntity) {
        this.visitEntity = visitEntity;
    }



    
}
