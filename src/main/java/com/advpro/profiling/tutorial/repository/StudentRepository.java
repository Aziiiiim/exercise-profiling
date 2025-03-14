package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query("SELECT s FROM Student s JOIN FETCH s.courses sc JOIN FETCH sc.course")
	List<Student> findAllWithCourses();
	
	@Query("SELECT s.name FROM Student s")
	List<String> findAllStudentNames();
	
	@Query("SELECT s FROM Student s ORDER BY s.gpa DESC LIMIT 1")
	Optional<Student> findTopStudentByGpa();
}