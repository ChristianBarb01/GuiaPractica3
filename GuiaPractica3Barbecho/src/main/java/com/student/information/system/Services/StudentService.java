package com.student.information.system.Services;

import com.student.information.system.Modelo.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();
    public Student findBynStudent(long numStudent);
    public Student findByEmail (String correo);
    public List<Student> findByOrderByGpa();
    public void saveOrUpdateStudent (Student student);
    public void deleteStudent (String id);

}
