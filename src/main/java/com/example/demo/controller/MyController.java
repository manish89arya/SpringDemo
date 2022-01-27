package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService course;

    @GetMapping("/home")
    public String getMessage(){
    return "ABC";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return course.getCourses();
    }

    @GetMapping("/courses/{course_id}")
    public Course getCourse(@PathVariable String course_id){
        return course.getACourse(Long.parseLong(course_id));
    }

    @PostMapping("/courses")
    public Course postCourse(@RequestBody Course course){
        return this.course.setACourse(course);
    }


}
