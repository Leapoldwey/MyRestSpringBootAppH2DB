package com.example.myrestspringbootapph2db.dao;

import com.example.myrestspringbootapph2db.entity.AcademicDisciplines;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ServiceDisciplinesDAO {
    List<AcademicDisciplines> showAllDisciplines();

    AcademicDisciplines getDisciplines(int id);

    AcademicDisciplines saveDisciplines(AcademicDisciplines disciplines);

    void deleteDisciplines(int id);

}
