package com.project.ownote.emp.adress.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmpAdressDto {

    private String empName;
    private String empEmail; // 필드 이름 수정
//    private int gradeNum;
//    private int deptNum;
    private String deptName; // deptName 추가
    private String gradeName; // gradeName 추가

    public EmpAdressDto(String empName, String empEmail, String deptName, String gradeName) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.deptName = deptName;
        this.gradeName = gradeName;
    }
}
