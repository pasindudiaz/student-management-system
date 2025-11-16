package edu.icet.controller;

import edu.icet.model.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("get")
    public ArrayList<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(){

    }

    @DeleteMapping
    public void  deleteStudent(){

    }

    @PatchMapping
    public void updateStudent(){

    }

}
