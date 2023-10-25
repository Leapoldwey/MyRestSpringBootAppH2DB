package com.example.myrestspringbootapph2db.service;

import com.example.myrestspringbootapph2db.dao.ServiceDAO;
import com.example.myrestspringbootapph2db.dao.ServiceDisciplinesDAO;
import com.example.myrestspringbootapph2db.entity.AcademicDisciplines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DisciplinesServiceImpl implements DisciplinesService{
    @Autowired
    private ServiceDisciplinesDAO serviceDisciplinesDAO;
    @Override
    @Transactional
    public List<AcademicDisciplines> showAllDisciplines() {
        return serviceDisciplinesDAO.showAllDisciplines();
    }

    @Override
    @Transactional
    public AcademicDisciplines saveDisciplines(AcademicDisciplines academicDisciplines) {
        return serviceDisciplinesDAO.saveDisciplines(academicDisciplines);
    }

    @Override
    @Transactional
    public AcademicDisciplines getDisciplines(int id) {
        return serviceDisciplinesDAO.getDisciplines(id);
    }

    @Override
    @Transactional
    public void deleteDisciplines(int id) {
        serviceDisciplinesDAO.deleteDisciplines(id);
    }
}
