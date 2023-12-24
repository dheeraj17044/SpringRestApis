package com.springRest.restApis.service;

import com.springRest.restApis.dto.AddCourseRequestDto;
import com.springRest.restApis.dto.UpdateCourseRequestDto;
import com.springRest.restApis.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();

    Course getCourse(String courseId);

    void addCourse(AddCourseRequestDto course);

    void deleteCourse(String courseId);

    int updateCourse(UpdateCourseRequestDto course);
}
