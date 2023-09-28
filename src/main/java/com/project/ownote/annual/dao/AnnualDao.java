package com.project.ownote.annual.dao;

import com.project.ownote.annual.dto.AnnualDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnualDao {

    List<AnnualDto> annualAllList();
    public void writeAnnual(AnnualDto annualDto);
//    public int deleteDao(int reNum);

public int countAnnual();

     public int codeId(String anninfo_code);

    String findEmpNameById(int emp_id);
    List<AnnualDto> annualAllList(int startRow, int size);

    List<AnnualDto>annualListByID(int emp_id);

String annualModify(Long annual_id);
}
