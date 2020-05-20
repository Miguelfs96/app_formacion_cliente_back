package com.formacion.back.controllers;

import com.formacion.back.entity.Candidatures;
import com.formacion.back.service.CandidatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CandidaturesController {

    @Autowired
    private CandidatureService candidatureService;

    @GetMapping("/candidatures")
    public List<Candidatures> findAll(){
        return candidatureService.findAll();
    }

}
