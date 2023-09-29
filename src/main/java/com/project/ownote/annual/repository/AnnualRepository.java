package com.project.ownote.annual.repository;

import com.project.ownote.annual.entity.Annual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository
public interface AnnualRepository extends JpaRepository<Annual,Long> {


}
