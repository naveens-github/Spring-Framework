package com.myproject.Scopes;

import com.myproject.AnnotationBasedConfiguration.Staff;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(scopeName = "singleton")
@Component
@Scope(scopeName = "prototype") // if we want to use Doctor object multiple times, container will gives a new object.
public class Doctor implements Staff {
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }
}
