package com.project.ownote.emp;

import com.project.ownote.emp.adress.dto.EmpAdressDto;
import com.project.ownote.emp.signUp.dto.SignUpDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EmpMapper {

    public void insertEmp(SignUpDto signUpDto);
    public List<EmpAdressDto> getEmpAddress();
}
