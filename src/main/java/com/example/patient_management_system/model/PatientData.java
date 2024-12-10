package com.example.patient_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_data")
public class PatientData 
{
    @Id
    private String patientId;
    private String patientName;
    private Integer patientAge;
    private String patientAddress;
    public PatientData()
    {

    }
    public PatientData(String patientId, String patientName, Integer patientAge, String patientAddress)
    {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientAddress = patientAddress;
    }
    public String getPatientId()
    {
        return patientId;
    }
    public void setPatientId(String patientId)
    {
        this.patientId = patientId;
    }
    public String getPatientName()
    {
        return patientName;
    }
    public void setPatientName(String patientName)
    {
        this.patientName = patientName;
    }
    public Integer getPatientAge()
    {
        return patientAge;
    }
    public void setPatientAge(Integer patientAge)
    {
        this.patientAge = patientAge;
    }
    public String getPatientAddress()
    {
        return patientAddress;
    } 
    public void setPatientAddress(String patientAddress)
    {
        this.patientAddress = patientAddress;
    }
}
