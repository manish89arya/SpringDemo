package com.example.demo.services;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(123,"Java"));
        list.add(new Course(234,"SpringBoot"));
    }


    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getACourse(long courseId) {
        Course c= null;
        for(Course course: list)
        {
            if(courseId==course.getId())
            {
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course setACourse(Course course) {
         list.add(course);
         return course;
    }

}
