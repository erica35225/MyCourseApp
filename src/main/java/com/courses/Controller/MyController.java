package com.courses.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.courses.Entities.Course;
import com.courses.Services.CourseService;

@RestController()
@RequestMapping("/private")
public class MyController {
    @Autowired
    private CourseService courseService;

    @CrossOrigin
    @GetMapping()
   // @PreAuthorize("hasRole('ADMIN')") //only user with ADMIN ROLE can access this api
    public String getHomePage() {
        return "This is your private HomePage";
    }
    //get all courses
    @CrossOrigin
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }
// get a course with given courseID

    @GetMapping("courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    // add a course in the course List
    @CrossOrigin
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    // update a course with given courseId
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @CrossOrigin
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
