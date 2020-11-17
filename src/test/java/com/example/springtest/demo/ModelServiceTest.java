package com.example.springtest.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by WarhearT on 17.11.2020.
 */

@SpringBootTest
class ModelServiceTest {


    @Autowired
    ModelService modelService;

    @Test
    void save() {

        Model model = new Model(1, "test");

        try {
            System.out.println("saved " + modelService.save(model));
        }
        catch (Exception e)
        {
            System.out.println("ZZZZZZZZZZZZZZZZZZ");
        }

            Model mode2 = new Model(2, "test");
            System.out.println("saved " + modelService.save(mode2));



    }
}