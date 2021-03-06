package com.inetsolv.demo.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Document(collection = "student")
public class Student {
    @Id
    private String id;

    @NotNull(message = "Not Null")
    @NotEmpty
    private String name;

    @Field(name = "mail")
    @Pattern(regexp = "^([0-9a-zA-Z]([-\\.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})$")
    private String email;

    @DBRef
    @Field(name = "department")
    private Department department;


   @DBRef
    private List<Subject> subjects;
    @Transient
    private double percentage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getPercentage() {
        if (null != subjects && subjects.size() > 0) {
            int total = 0;
            for (Subject subject : subjects) {
                total += subject.getMarksObtained();
            }
            return total / subjects.size();
        }
        return 0.0;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
