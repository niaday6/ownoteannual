package com.project.ownote.annual.repository;

import com.project.ownote.annual.entity.Annual;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class AnnualEm {

    @PersistenceContext
    EntityManager em;


    @Transactional
    public void annDeleteById(Long annual_id) {
        Annual annual = em.find(Annual.class, annual_id);
        if (annual != null) {
            em.remove(annual);
        }
    }

    public Annual annFindById(Long annual_id){
        Annual annual = em.find(Annual.class,annual_id);
        return annual;
    }


    @Transactional
    public void annModify(Annual annual){
        em.merge(annual);

    }


}
