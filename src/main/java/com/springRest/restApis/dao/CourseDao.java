package com.springRest.restApis.dao;

import com.springRest.restApis.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer> {



//    List<Course> getCourses();
//    Course getCourse(int courseId);
//    void addCourse(Course course);
//
//    Course deleteCourse(int csId);
//
//    int updateCourse(Course course);
}
