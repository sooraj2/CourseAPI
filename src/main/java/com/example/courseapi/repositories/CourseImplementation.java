package com.example.courseapi.repositories;


import com.example.courseapi.CourseApiApplication;
import com.example.courseapi.CourseRepository;
import com.example.courseapi.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CourseImplementation {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }


}
