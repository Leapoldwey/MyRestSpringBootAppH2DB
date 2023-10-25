package com.example.myrestspringbootapph2db.service;

import com.example.myrestspringbootapph2db.entity.AcademicDisciplines;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DisciplinesService {
    List<AcademicDisciplines> showAllDisciplines();

    AcademicDisciplines saveDisciplines(AcademicDisciplines academicDisciplines);

    AcademicDisciplines getDisciplines(int id);

    void deleteDisciplines(int id);
}
