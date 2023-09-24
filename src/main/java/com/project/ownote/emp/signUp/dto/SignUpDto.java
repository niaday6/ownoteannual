package com.project.ownote.emp.signUp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SignUpDto {

    private int empId;
    private Integer empNum;
    private String empPassword;
    private String empName;
    private String empBirth;
    private String empEmail;
    private String empPhone;
    private LocalDateTime empDate;
    private int gradeNum;
    private int deptNum;

    public SignUpDto(Integer empNum, String empPassword, String empName, String empBirth, String empEmail, String empPhone, LocalDateTime empDate, int gradeNum, int deptNum) {
        this.empNum = empNum;
        this.empPassword = empPassword;
        this.empName = empName;
        this.empBirth = empBirth;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
        this.empDate = empDate;
        this.gradeNum = gradeNum;
        this.deptNum = deptNum;
    }
}
