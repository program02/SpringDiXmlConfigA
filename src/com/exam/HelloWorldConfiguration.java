/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Student
 */
@Configuration
public class HelloWorldConfiguration {
    // equivalent to <bean id="provider" class=".."/>

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

// equivalent to <bean id="renderer" class=".."/>
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
