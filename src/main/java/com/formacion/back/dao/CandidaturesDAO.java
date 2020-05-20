package com.formacion.back.dao;

import com.formacion.back.entity.Candidatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CandidaturesDAO extends JpaRepository<Candidatures,Integer>{
}
