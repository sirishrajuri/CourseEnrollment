package com.sample.classenrollment.services;

import com.sample.classenrollment.models.Course;
import com.sample.classenrollment.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public List<Course> addCourse(Course course){
        courseRepository.save(course);
        return getAllCourses();
    }
}
