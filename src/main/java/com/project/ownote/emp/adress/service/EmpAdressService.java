package com.project.ownote.emp.adress.service;

import com.project.ownote.emp.adress.dto.EmpAdressDto;
import com.project.ownote.emp.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpAdressService {

    @Autowired
    private EmpMapper empMapper;

    public List<EmpAdressDto> getEmpAddress(){
        List<EmpAdressDto> getEmpAddress = empMapper.getEmpAddress();
        return getEmpAddress;
    }

}
