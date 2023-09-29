package com.project.ownote.annual.repository;

import com.project.ownote.annual.entity.Anndata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnndataRepository extends JpaRepository<Anndata,Long> {
}
