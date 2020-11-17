package com.example.springtest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by WarhearT on 17.11.2020.
 */

@Service
public class ModelService {


    @Autowired
    ModelRep modelRep;

    @Transactional
    public Model save(Model model) {
        return modelRep.save(model);
    }


}
