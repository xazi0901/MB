package com.capgemini.wsb.rest;

import org.springframework.web.bind.annotation.RestController;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.rest.exception.EntityNotFoundException;
import com.capgemini.wsb.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PatientController {
    
    private final PatientService patientService;


    public PatientController(PatientService patientService){
        this.patientService = patientService;
 
    }

    @GetMapping("/patient/{id}")
    PatientTO findById (@PathVariable final Long id) {
      final PatientTO patient =  patientService.findById(id);
      
      if(patient != null){
        System.out.println(patient.getVisitEntity());
        return patient;
      }
      throw new EntityNotFoundException(id);
    }

    @DeleteMapping("/patientDelete/{id}")
    String deleteById(@PathVariable final Long id){
        final PatientTO patientToDelete = patientService.findById(id);
        if(patientToDelete != null){
            patientService.deleteById(id);
             return "Succed";
        }
        return "KUPA";
       
    }

    @DeleteMapping("/patientDelete1/{id}")
    public void deleteByEntity(@PathVariable final Long id){
        final PatientTO toDelete = patientService.findById(id);
        patientService.deleteByEntity(toDelete);
        
    }
    
}
