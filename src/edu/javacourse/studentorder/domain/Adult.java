package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person
{
    private String passportSeria; //Паспорт серия
    private String passportNumber; //Паспорт номер
    private LocalDate issueDate; //Когда выдан
    private String issueDepartment; //Кем выдан
    private String university; //учебное заведение
    private String studentId; // Номер студенческого Билета

    public String getAdultString(){
        return surName + " " + givenName + " " + passportSeria;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
