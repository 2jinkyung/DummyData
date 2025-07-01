package com.project.core;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DummyGeneratorTest {

    private static final Logger log = LoggerFactory.getLogger(DummyGeneratorTest.class);
    DummyGenerator dummyGenerator = new DummyGenerator();
    @Test
    void generateDummy() {
        User user =(User) dummyGenerator.generateDummy(User.class);
        log.info("name : "+user.getName());
        log.info("age : "+user.getAge());


        assertNotNull(user);
        assertNotNull(user.getName());
        assertTrue(user.getName().startsWith("str_"));
        assertTrue(user.getAge() >= 0 && user.getAge() < 100);
    }

    @Test
    void generateValueOfType() {
        log.info(dummyGenerator.generateValueOfType(String.class).toString());
        log.info(dummyGenerator.generateValueOfType(Integer.class).toString());
        log.info(dummyGenerator.generateValueOfType(LocalDate.class).toString());
    }
}