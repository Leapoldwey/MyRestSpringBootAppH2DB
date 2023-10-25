package com.example.myrestspringbootapph2db.service;

import com.example.myrestspringbootapph2db.dao.ServiceDAO;
import com.example.myrestspringbootapph2db.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private ServiceDAO serviceDAO;
    @Override
    @Transactional
    public List<Student> getAllStudent() {
        return serviceDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return serviceDAO.getStudent(id);
    }


    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return serviceDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        serviceDAO.deleteStudent(id);
    }
}
