package com.project.ownote.annual.service;

import com.project.ownote.annual.dao.AnndataDao;
import com.project.ownote.annual.entity.Anndata;
import com.project.ownote.annual.repository.AnndataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnndataService {
    @Autowired
    AnndataDao anndataDao;
            @Autowired
    AnndataRepository anndataRepository;
}
