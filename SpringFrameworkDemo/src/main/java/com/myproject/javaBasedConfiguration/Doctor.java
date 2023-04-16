package com.myproject.javaBasedConfiguration;

import com.myproject.AnnotationBasedConfiguration.Staff;
import org.springframework.stereotype.Component;

//@Component
public class Doctor implements Staff {
    @Override
    public void assist() {
        System.out.println("Doctor is assisting");
    }
}
