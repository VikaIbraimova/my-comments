package edu.javacourse.spring;

import edu.javacourse.spring.beans.MathFuncExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vika on 29.03.16.
 */
public class SpringExamples {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
        MathFuncExample mathFuncExample0 = context.getBean("mathFuncExample",MathFuncExample.class);
        System.out.println("Method Plus result: "+ mathFuncExample0.plus(1,1));
    }
}
