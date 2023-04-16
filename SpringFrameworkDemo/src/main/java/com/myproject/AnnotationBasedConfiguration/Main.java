package com.myproject.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotationBasedConfig.xml");

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        Staff staff = context.getBean(Nurse.class);
        staff.assist();
    }
}
