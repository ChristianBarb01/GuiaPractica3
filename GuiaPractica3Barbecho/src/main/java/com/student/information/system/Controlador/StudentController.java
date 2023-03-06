package com.student.information.system.Controlador;

import com.student.information.system.Modelo.Student;
import com.student.information.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/listar")
    public List<Student> getAllStudent(){
        return studentService.findAll();
    }

    @GetMapping(value = "/buscar/{nStudent}")
    public Student findByNStudent (@PathVariable ("student") Long nStudent ){
        return studentService.findBynStudent(nStudent);
    }

    @GetMapping(value = "/buscar/{email}")
    public Student getByEmail (String email){
            return studentService.findByEmail(email);
    }

    @GetMapping(value = "/orderByGpa")
    public List<Student> findAllByOrderByGpaDesc(){
        return studentService.findByOrderByGpa();
    }
    @PostMapping(value = "/agregar")
    public ResponseEntity<?> SaveOrUpdateStudent(@RequestBody Student student){
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity("Estudiante agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/eliminar/{nStudent}")
    public void DeleteStudent (@PathVariable Long nStudent){
        studentService.deleteStudent(studentService.findBynStudent(nStudent).getId());
    }

}
