package com.example.courseapi;

import com.example.courseapi.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
