package com.reminisense.fa.dao;

import com.reminisense.fa.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Nigs on 2016-04-13.
 */
@Test
@ContextConfiguration(locations = { "classpath:test-config.xml" })
public class PersonDAOImplTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private PersonDAO personDAO;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    @Transactional
    public void testList() {
        List<Person> personList = personDAO.listPersons();
        Assert.assertNotNull(personList);
    }


}