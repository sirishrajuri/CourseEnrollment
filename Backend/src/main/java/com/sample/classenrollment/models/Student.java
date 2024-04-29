package com.sample.classenrollment.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String name;

    private String major;

    private Date expectedGraduationDate;

    @ManyToMany
    private Set<Course> classes = new HashSet<>();
}