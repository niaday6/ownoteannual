package com.project.ownote.annual.repository;

import com.project.ownote.annual.dto.Annual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface AnnualRepository extends JpaRepository<Annual,Long> {

@Transactional
    @Modifying
    @Query("update Annual m set m.annual_content = :annual_content, " +
            "m.annual_startdate = :annual_startdate, " +
            "m.annual_enddate = :annual_enddate, " +
            "m.annual_time = :annual_time, " +
            "m.anninfo_code = :anninfo_code " +
            "where m.annual_id= :annual_id")
    int annModifyById(@Param("annual_content") String annual_content,
                      @Param("annual_startdate") Date annual_startdate,
                      @Param("annual_enddate") Date annual_enddate,
                      @Param("annual_time") double annual_time,
                      @Param("anninfo_code") int anninfo_code,
                      @Param("annual_id") Long annual_id);




}
