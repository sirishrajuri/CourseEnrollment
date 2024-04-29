package com.sample.classenrollment.repositories;

import com.sample.classenrollment.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
