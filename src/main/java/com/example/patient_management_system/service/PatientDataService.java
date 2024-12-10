package com.example.patient_management_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.patient_management_system.model.PatientData;

@Service
public interface PatientDataService 
{
    public String createPatientData(PatientData patientData);
    public String updatePatientData(PatientData patientData);
    public String deletePatientData(String patientId);
    public PatientData getPatientData(String patientId);
    public List<PatientData> getAllPatientData();
}
