package com.example.springtest.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by WarhearT on 17.11.2020.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    private int id;

    @Column(unique = true)
    private String name;


}
