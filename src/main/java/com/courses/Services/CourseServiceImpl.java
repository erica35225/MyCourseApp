package com.courses.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.Dao.CourseDao;
import com.courses.Entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	//List<Course> coursesList = new ArrayList<Course>();
	@Autowired
	private CourseDao courseDao;
	
		public CourseServiceImpl() {
			
		}
//		coursesList.add(new Course(123L,"Java","Learn Fundamentals of programming"));
//		coursesList.add(new Course(124L,"ReactJS","Learn Fundamentals of REACT JS"));
//		coursesList.add(new Course(125L,"ANGULAR JS","Learn Fundamentals of Angular Js"));

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(Long courseId) {
//		Course requiredCourse = null;
//		for(Course course:coursesList) {
//			if(course.getCourseId() == courseId) {
//				requiredCourse = course;
//			}
//		}
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		coursesList.add(course);
		 courseDao.save(course);
		 return course;
		
	}

	@Override
	public Course updateCourse(Course course) {
//		coursesList.forEach(e->{
//			if(e.getCourseId() == course.getCourseId()) {
//				e.setCourseName(course.getCourseName());
//				e.setCourseDesc(course.getCourseDesc());
//			}
//		});
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(Long courseId) {
//		coursesList = this.coursesList.stream().filter(e->e.getCourseId()!=courseId).collect(Collectors.toList());
		courseDao.delete(courseDao.getById(courseId));
	}
//	List<String> names = Arrays.asList("eerica","errica","erica","eric");
//		public String getName()
//			return null;
//		}

}
