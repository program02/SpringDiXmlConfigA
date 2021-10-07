/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Student
 */
public class HelloWorldSpringDI {

    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/exam/app-context.xml"); //using xml configuration
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);  //using annotation

        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }

}
