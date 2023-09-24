package com.project.ownote.emp.signUp.service;

import com.project.ownote.emp.EmpMapper;
import com.project.ownote.emp.signUp.dto.SignUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private EmpMapper empMapper;

    public void insertEmp(SignUpDto signUpDto) {
        empMapper.insertEmp(signUpDto);
    }

}
