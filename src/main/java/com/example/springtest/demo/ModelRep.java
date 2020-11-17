package com.example.springtest.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by WarhearT on 17.11.2020.
 */

@Repository
public interface ModelRep extends CrudRepository<Model,Integer> {


}
