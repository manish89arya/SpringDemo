package com.example.demo.entity;

public class Course {

    private long id;
    private String course_name;

    public Course(long id, String course_name) {
        this.id = id;
        this.course_name = course_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                '}';
    }

}
