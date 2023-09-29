package com.project.ownote.annual.repository;

import com.project.ownote.annual.entity.Anndata;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AnndataEm {
    @PersistenceContext
    EntityManager em;



}
