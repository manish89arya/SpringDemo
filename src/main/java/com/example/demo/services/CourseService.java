package com.example.demo.services;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getACourse(long courseId);
    public Course setACourse(Course course);
}
