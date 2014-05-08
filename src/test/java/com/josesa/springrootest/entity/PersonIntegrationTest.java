package com.josesa.springrootest.entity;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Person.class)
public class PersonIntegrationTest {

    @Test
    public void customTest() {
    	Person randomPerson = dod.getRandomPerson();
    	assertNotNull(randomPerson);
    }
}
