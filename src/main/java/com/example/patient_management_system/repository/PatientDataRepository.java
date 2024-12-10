package com.example.patient_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.patient_management_system.model.PatientData;

public interface PatientDataRepository extends JpaRepository<PatientData, String>
{
        
} 
