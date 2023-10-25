package com.example.myrestspringbootapph2db.controller.students;

import com.example.myrestspringbootapph2db.entity.Student;
import com.example.myrestspringbootapph2db.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public class MyController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudent() {
        List<Student> allStudent = studentService.getAllStudent();
        return allStudent;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id")int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "add student success";
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "save student success";
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }
}
