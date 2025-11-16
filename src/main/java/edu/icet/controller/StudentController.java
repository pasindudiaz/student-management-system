package edu.icet.controller;

import edu.icet.model.dto.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    @GetMapping()
    public ArrayList<Student> getAllStudents(){

        return null;
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
