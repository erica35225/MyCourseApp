package com.courses.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Course {
    @Id
    private Long courseId;
    private String courseName;
    private String courseDesc;

    public Course() {

    }

    public Course(Long courseId, String courseName, String courseDesc) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }


}
