package com.example.courseapi;


import com.example.courseapi.entities.Course;
import com.example.courseapi.repositories.CourseImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseImplementation courseImplementation;

    @GetMapping("/")
    public String hello(){
        return "working??";
    }

    @GetMapping("/Courses")
    public List<Course> getCourses(){
        return courseImplementation.getCourses();
    }

    @PostMapping("/add")
    public Course uploadCourse(@RequestBody Course course){
        return courseImplementation.addCourse(course);
    }


}
