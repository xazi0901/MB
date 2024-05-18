package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;


public interface PatientService {
    
    public PatientTO findById(final Long id);

    public void deleteById(final Long id);

    public void deleteByEntity(final PatientTO patientTO);
}
