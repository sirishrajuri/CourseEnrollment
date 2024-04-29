package com.sample.classenrollment.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long code;
    private String name;
    private String subject;
    private int maxStudents;
    private String semester;

}
