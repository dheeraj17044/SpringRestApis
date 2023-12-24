package com.springRest.restApis.controllers;

import com.springRest.restApis.dto.AddCourseRequestDto;
import com.springRest.restApis.dto.UpdateCourseRequestDto;
import com.springRest.restApis.entities.Course;
import com.springRest.restApis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public ResponseEntity<Object> getHome(){
        return new ResponseEntity<>("Welcome to the Course Application",HttpStatus.OK);
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getCourses(){
        return new ResponseEntity<>(courseService.getCourses(),HttpStatus.OK);
    }

    @GetMapping("/courses/{courseId}")
    public ResponseEntity<Course> getCourse(@PathVariable String courseId){
        Course course = courseService.getCourse(courseId);
        return new ResponseEntity<>(course,HttpStatus.OK);
    }

    @PostMapping("/courses")
    public ResponseEntity<Object> addCourse(@RequestBody AddCourseRequestDto course){
        courseService.addCourse(course);
        return new ResponseEntity<>("added successfully",HttpStatus.OK);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<Object> deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }

    @PutMapping("/courses")
    public ResponseEntity<Object> updateCourse(@RequestBody UpdateCourseRequestDto course){
        int csId = courseService.updateCourse(course);
        return new ResponseEntity<>(csId,HttpStatus.OK);
    }

}
