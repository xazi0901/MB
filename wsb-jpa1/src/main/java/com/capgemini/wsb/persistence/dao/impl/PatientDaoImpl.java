package com.capgemini.wsb.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity,Long> implements PatientDao{

    // IMPLEMENTACJA FUNKCJI DO WYSZUKIWANIA PACJENTÓW PO NAZWISKU! DO TESTÓW Z LABA 4
    //  @Override
    // public PatientEntity findOneByLastName(String lastname){
     
        
    // }
    
}
