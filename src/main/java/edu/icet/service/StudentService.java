package edu.icet.service;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    ArrayList<Student> StudentList = new ArrayList<>();

    public ArrayList<Student> getAllStudents() {
        StudentList.clear();
       for(StudentEntity studentEntity : studentRepository.findAll()){
        StudentList.add(new Student(studentEntity.getId(),
                            studentEntity.getName(),
                            studentEntity.getAddress(),
                            studentEntity.getDOB(),
                            studentEntity.getEmail(),
                            studentEntity.getPhoneNumber()));

       }
       return StudentList;
    }

    public void addStudent(Student student) {
        studentRepository.save(new StudentEntity(student.getId(),
                student.getName(),
                student.getAddress(),
                student.getDOB(),
                student.getEmail(),
                student.getPhoneNumber()));
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }


    public void updateStudent(Student student) {
        studentRepository.save(new StudentEntity(student.getId(),
                student.getName(),
                student.getAddress(),
                student.getDOB(),
                student.getEmail(),
                student.getPhoneNumber()));
    }

    public Student searchStudent(String id) {
        Optional<StudentEntity> StudentEntity = studentRepository.findById(id);
        return ( new Student(StudentEntity.get().getId(),
                StudentEntity.get().getName(),
                StudentEntity.get().getAddress(),
                StudentEntity.get().getDOB(),
                StudentEntity.get().getEmail(),
                StudentEntity.get().getPhoneNumber()));

    }
}
