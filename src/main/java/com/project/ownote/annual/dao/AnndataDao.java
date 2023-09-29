package com.project.ownote.annual.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnndataDao {

    public int findDate(int emp_id);

}
