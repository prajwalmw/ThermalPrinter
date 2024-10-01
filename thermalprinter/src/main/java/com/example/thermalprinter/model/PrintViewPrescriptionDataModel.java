package com.example.thermalprinter.model;
/**
* Created by - Prajwal W. on 30/09/24.
* Email: prajwalwaingankar@gmail.com
* Mobile: +917304154312
**/

public class PrintViewPrescriptionDataModel<T> {
    /*
        visitUuid, patHistory, famHistory, height, weight, bpSys, bpDias, pulse, hasLicense,
        temperature, resp, spO2, complaint, rxReturned, testsReturned, medicalAdviceTextView,
        diagnosisReturned, followUpDate, doctorName, prescription1, prescription2, mBP
     */
    private String visitUuid;
    private T patHistory, famHistory,height,weight,bpSys,bpDias,pulse,
            temperature,resp,spO2,complaint;

    private boolean hasLicense;
    private String rxReturned;
    private String testsReturned;
    private String diagnosisReturned;
    private String followUpDate;
    private String doctorName;
    private String prescription1;
    private String prescription2;
    private String BP;
    private String medicalAdvice;


    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public String getVisitUuid() {
        return visitUuid;
    }

    public void setVisitUuid(String visitUuid) {
        this.visitUuid = visitUuid;
    }

    public T getPatHistory() {
        return patHistory;
    }

    public void setPatHistory(T patHistory) {
        this.patHistory = patHistory;
    }

    public T getFamHistory() {
        return famHistory;
    }

    public void setFamHistory(T famHistory) {
        this.famHistory = famHistory;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public T getBpSys() {
        return bpSys;
    }

    public void setBpSys(T bpSys) {
        this.bpSys = bpSys;
    }

    public T getBpDias() {
        return bpDias;
    }

    public void setBpDias(T bpDias) {
        this.bpDias = bpDias;
    }

    public T getPulse() {
        return pulse;
    }

    public void setPulse(T pulse) {
        this.pulse = pulse;
    }


    public T getTemperature() {
        return temperature;
    }

    public void setTemperature(T temperature) {
        this.temperature = temperature;
    }

    public T getResp() {
        return resp;
    }

    public void setResp(T resp) {
        this.resp = resp;
    }

    public T getSpO2() {
        return spO2;
    }

    public void setSpO2(T spO2) {
        this.spO2 = spO2;
    }

    public T getComplaint() {
        return complaint;
    }

    public void setComplaint(T complaint) {
        this.complaint = complaint;
    }

    public String getRxReturned() {
        return rxReturned;
    }

    public void setRxReturned(String rxReturned) {
        this.rxReturned = rxReturned;
    }

    public String getTestsReturned() {
        return testsReturned;
    }

    public void setTestsReturned(String testsReturned) {
        this.testsReturned = testsReturned;
    }

    public String getDiagnosisReturned() {
        return diagnosisReturned;
    }

    public void setDiagnosisReturned(String diagnosisReturned) {
        this.diagnosisReturned = diagnosisReturned;
    }

    public String getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(String followUpDate) {
        this.followUpDate = followUpDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPrescription1() {
        return prescription1;
    }

    public void setPrescription1(String prescription1) {
        this.prescription1 = prescription1;
    }

    public String getPrescription2() {
        return prescription2;
    }

    public void setPrescription2(String prescription2) {
        this.prescription2 = prescription2;
    }


    public String getBP() {
        return BP;
    }

    public void setBP(String BP) {
        this.BP = BP;
    }



    public String getMedicalAdvice() {
        return medicalAdvice;
    }

    public void setMedicalAdvice(String medicalAdvice) {
        this.medicalAdvice = medicalAdvice;
    }

}
