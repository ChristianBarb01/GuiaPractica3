package com.student.information.system.Services;

import com.student.information.system.Modelo.Student;
import com.student.information.system.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository estRepositorio;

    @Override
    public List<Student> findAll() {
        return estRepositorio.findAll();
    }

    @Override
    public Student findBynStudent(long numStudent) {
        return estRepositorio.findBynStudent(numStudent);
    }

    @Override
    public Student findByEmail(String correo) {
        return estRepositorio.findByEmail(correo);
    }

    @Override
    public List<Student> findByOrderByGpa() {
        return estRepositorio.findByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        estRepositorio.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        estRepositorio.deleteById(id);
    }
}
