package com.sample.classenrollment.services;

import com.sample.classenrollment.repositories.CourseRepository;
import com.sample.classenrollment.repositories.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
}
