package com.capgemini.wsb.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    
    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao pPatientDao){
        patientDao = pPatientDao;
    }

    @Override
    public PatientTO findById(Long id){
        final PatientEntity entity = patientDao.findOne(id);
        return PatientMapper.mapToTO(entity); 
    }

    @Override
    public void deleteById(Long id){
         patientDao.getOne(id);
        patientDao.delete(id);
      
    }
    @Override
    public void deleteByEntity(PatientTO patientTO){
        final PatientEntity toDelete = PatientMapper.mapToEntity(patientTO);
      
        patientDao.delete(toDelete);
    }

}
