package com.sample.classenrollment.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(CourseStudentId.class)
public class CourseStudent {

    @Id
    @ManyToOne
    @JoinColumn(name="courseCode")
    private Course course;

    @Id
    @ManyToOne
    @JoinColumn(name="studentId")
    private Student student;

    private String grade;

}
