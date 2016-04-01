package edu.javacourse.spring;


import edu.javacourse.spring.beans.Car7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanExample {

    //private static Logger log = LoggerFactory.getLogger(SimpleBeanExample.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springExample.xml"});
        Car7 car7 = context.getBean("car7",Car7.class);
        System.out.println("Model car: " + car7.getModel());

        //log.debug("\n\n\n");

        //Car6 car = context.getBean("car", Car6.class);
        //log.debug("id: {}", car.getId());
        //log.debug("owner: {}", car.getOwner());
        //System.out.println("id: " + car.getId());
        //System.out.println("owner: " + car.getOwner());

    }
}