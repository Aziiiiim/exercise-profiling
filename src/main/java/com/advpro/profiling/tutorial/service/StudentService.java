package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
//import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    //private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<Student> students = studentRepository.findAllWithCourses(); // Only 1 SQL query
        
        return students.stream()
        	    .flatMap(student -> student.getStudentCourses().stream())
        	    .toList();
    }


    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findTopStudentByGpa();
    }


    public String joinStudentNames() {
        List<String> studentNames = studentRepository.findAllStudentNames();
        return String.join(", ", studentNames);
    }


}

