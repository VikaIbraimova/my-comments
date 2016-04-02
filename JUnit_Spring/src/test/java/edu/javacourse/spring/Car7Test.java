package edu.javacourse.spring;

import edu.javacourse.spring.beans.Car7;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springExample.xml"})
public class Car7Test {

    @Autowired
    ApplicationContext context;

    /**
     * Перед запуском всех тестов для класса
     */
    @Before
    public void init() {
        /**
         * Создаем объект тестируемого класса(создаем бин)
         */
        Car7 car7_3 = context.getBean("car7",Car7.class);
        Assert.assertNotNull(car7_3);
        System.out.println(car7_3.toString());

    }

    /**
     * Метод calls тестирует правильность счетчика вызовов.
     */
    @Test
    public void calls() {
        Assert.assertEquals(0,context.getBean("car7",Car7.class).getCalls());
    }
}
