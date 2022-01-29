package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String getMessage(){
    return "ABC";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{course_id}")
    public Course getCourse(@PathVariable String course_id){
        return courseService.getACourse(Long.parseLong(course_id));
    }

    @PostMapping("/courses")
    public Course postCourse(@RequestBody Course course){
        return this.courseService.setACourse(course);
    }

    @PutMapping("/courses/{courseId}")
    public void updateCourse(@RequestBody Course newcourse,@PathVariable String courseId){
         this.courseService.updateACourse(newcourse, Integer.parseInt(courseId));
    }

}
