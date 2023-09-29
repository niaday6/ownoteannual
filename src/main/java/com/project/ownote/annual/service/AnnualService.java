package com.project.ownote.annual.service;

import com.project.ownote.annual.dao.AnnualDao;
import com.project.ownote.annual.dto.AnnualDto;
import com.project.ownote.annual.dto.AnnualPage;
import com.project.ownote.annual.repository.AnnualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnualService {


@Autowired
    AnnualDao annualDao;
@Autowired
    AnnualRepository annualRepository;

private int size = 10;

public AnnualPage getAnnualPage (int pageNum){
int total = annualDao.countAnnual();
List<AnnualDto> content = annualDao.annualAllList((pageNum -1) * size, size);

    return new AnnualPage(total, pageNum,size,content);
    }

public String findEmpNameById(int emp_id){
    return annualDao.findEmpNameById(emp_id);
}


public AnnualDto findById(Long annual_id){
    return annualDao.annualModify(annual_id);
}

    public List<AnnualDto>annualList22(int emp_id){
    return annualDao.annualList22(emp_id);
    }


public int countAnnualdate(int emp_id){
    return annualDao.countAnnualdate(emp_id);
}

}
