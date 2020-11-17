package com.example.springtest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * Created by WarhearT on 17.11.2020.
 */

@Service
public class ModelService {


    @Autowired
    ModelRep modelRep;


    public Model save(@Valid Model model) {

//        throw new RuntimeException("asd");
        return modelRep.save(model);
    }


}
