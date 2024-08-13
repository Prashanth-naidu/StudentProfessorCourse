package com.example.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import java.util.*;
import com.example.university.model.*;
import com.example.university.service.*;

@RestController
public class StudentController {

    @Autowired
    private StudentJpaService ss;

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return ss.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId) {
        return ss.getStudentById(studentId);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return ss.addStudent(student);
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudet(@PathVariable("studentId") int studentId, @RequestBody Student student){
        return ss.updateStudet(studentId, student);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId) {
        ss.deleteStudent(studentId);
    }

    @GetMapping("/students/{studentId}/courses")
    public List<Course> getStudentCourses(@PathVariable("studentId") int studentId) {
        return ss.getStudentCourses(studentId);
    }
}