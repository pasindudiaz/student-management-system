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

    @GetMapping("/get")
    public ArrayList<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/post")
    public void addStudent(@RequestBody Student student){
         studentService.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteStudent(@PathVariable ("id")  String id){
           studentService.deleteStudent(id);
    }

    @PatchMapping("/update")
    public void updateStudent(@RequestBody Student student){
         studentService.updateStudent(student);
    }

    @GetMapping("/search/{id}")
    public Student searchStudent(@PathVariable ("id")  String id){
        return studentService.searchStudent(id);
    }

}
