package com.example.myrestspringbootapph2db.dao;

import com.example.myrestspringbootapph2db.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
