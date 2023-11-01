package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person
{
    private  String certificateNumber; //Номер свидетельства
    private LocalDate issueDate; //Номер свидетельства
    private String issueDepartment;

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
