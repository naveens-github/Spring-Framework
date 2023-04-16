package com.myproject.javaBasedConfiguration;

import com.myproject.AnnotationBasedConfiguration.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Staff staff = context.getBean(Doctor.class);
        staff.assist();

    }
}
