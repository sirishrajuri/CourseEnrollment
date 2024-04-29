package com.sample.classenrollment.controllers;

import com.sample.classenrollment.models.Course;
import com.sample.classenrollment.repositories.CourseRepository;
import com.sample.classenrollment.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

//    @GetMapping("/")
//    public ResponseEntity<List<Course>> getCourses() {
//        return ResponseEntity.ok().body(courseRepository.findAll());
//    }

    @PostMapping("/create")
    public ResponseEntity<List<Course>> createCourses(@RequestBody Course course) {
        //validations

        return ResponseEntity.ok().body(courseService.addCourse(course));
    }


}
