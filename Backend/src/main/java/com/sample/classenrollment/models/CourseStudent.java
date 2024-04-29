package com.sample.classenrollment.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(CourseStudentId.class)
public class CourseStudent {

    @Id
    @ManyToOne
    @JoinColumn(name = "courseCode")
    private Course courseCode;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student studentId;

    private String grade;

}
