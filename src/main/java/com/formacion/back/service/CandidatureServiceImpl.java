package com.formacion.back.service;

import com.formacion.back.dao.CandidaturesDAO;
import com.formacion.back.entity.Candidatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatureServiceImpl implements CandidatureService {

    @Autowired
    private CandidaturesDAO candidaturesDAO;

    @Override
    public List<Candidatures> findAll() {
        return candidaturesDAO.findAll();
    }

}
