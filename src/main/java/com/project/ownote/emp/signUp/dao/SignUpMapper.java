package com.project.ownote.emp.signUp.dao;

import com.project.ownote.emp.signUp.dto.SignUpDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SignUpMapper {

    void insertEmp(SignUpDto signUpDto);

}
