package com.example.patient_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.patient_management_system.model.PatientData;
import com.example.patient_management_system.service.PatientDataService;

@RestController
@RequestMapping("/patientdata")
public class PatientDataController 
{
    @Autowired 
    private PatientDataService patientDataService;

    @GetMapping("{patientId}")
    public PatientData getPatientData(@PathVariable("patientId") String patientId)
    {
        return patientDataService.getPatientData(patientId);
    }
    @GetMapping
    public List<PatientData> getAllPatientData()
    {
        return patientDataService.getAllPatientData();
    }
    @PostMapping
    public String createPatientData(@RequestBody PatientData patientData)
    {
        patientDataService.createPatientData(patientData);
        return "Patient data created successfully...";
    }
    @PutMapping
    public String updatePatientData(@RequestBody PatientData patientData)
    {
        patientDataService.updatePatientData(patientData);
        return "Patient data updated successfully...";
    }
    @DeleteMapping("{patientId}")
    public String deletePatientData(@PathVariable("patientId") String patientId)
    {
        patientDataService.deletePatientData(patientId);
        return "Patient data deleted successfully...";
    }
}
