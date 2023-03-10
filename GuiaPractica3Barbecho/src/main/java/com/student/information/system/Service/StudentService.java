package com.student.information.system.Service;

import com.student.information.system.Modelo.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();
    public Student findBynStudent(long nStudent);
    public Student findByEmail (String email);
    public List<Student> findByOrderByGpa();
    public void saveOrUpdateStudent (Student student);
    public void deleteStudent (String id);

}
