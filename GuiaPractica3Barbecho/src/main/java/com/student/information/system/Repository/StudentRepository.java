package com.student.information.system.Repository;

import com.student.information.system.Modelo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findBynStudent(long nStudent);
    Student findByEmail (String email);
    List<Student> findByOrderByGpa();

}
