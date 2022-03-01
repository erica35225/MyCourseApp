package com.courses.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.Entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
