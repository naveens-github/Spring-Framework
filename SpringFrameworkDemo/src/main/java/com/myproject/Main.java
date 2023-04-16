package com.myproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = context.getBean(Nurse.class);
        //We can declare the above line as below.
        Nurse nurse1 = (Nurse) context.getBean("nurse");
        doctor.assist();
        nurse.assist();
        nurse1.assist();
        //We can create staff object also.
        Staff staff = context.getBean(Doctor.class);
        Staff staff1 = context.getBean(Nurse.class);
        staff.assist();
        staff1.assist();
        //To get property value of doctor object
        System.out.println(doctor.getQualification());
    }
}