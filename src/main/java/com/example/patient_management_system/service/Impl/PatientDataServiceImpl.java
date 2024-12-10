package com.example.patient_management_system.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patient_management_system.model.PatientData;
import com.example.patient_management_system.repository.PatientDataRepository;
import com.example.patient_management_system.service.PatientDataService;

@Service
public class PatientDataServiceImpl implements PatientDataService
{
    @Autowired
    private PatientDataRepository patientDataRepository;

    @Override
    public String createPatientData(PatientData patientData) 
    {
        patientDataRepository.save(patientData);
        return "Patient Data created successfully...";
    }

    @Override
    public String updatePatientData(PatientData patientId) 
    {
        patientDataRepository.save(patientId);
        return "Patient Data updated successfully...";
    }

    @Override
    public String deletePatientData(String patientId) 
    {
        patientDataRepository.deleteById(patientId);
        return "Patient Data deleted succcessfully";
    }

    @Override
    public PatientData getPatientData(String patientId) 
    {
        return patientDataRepository.findById(patientId).get();
    }

    @Override
    public List<PatientData> getAllPatientData() 
    {
        return patientDataRepository.findAll();
    }
    
}
