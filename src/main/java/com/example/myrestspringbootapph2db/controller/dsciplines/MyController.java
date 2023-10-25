package com.example.myrestspringbootapph2db.controller.dsciplines;

import com.example.myrestspringbootapph2db.dao.ServiceDisciplinesDAO;
import com.example.myrestspringbootapph2db.entity.AcademicDisciplines;
import com.example.myrestspringbootapph2db.service.DisciplinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private DisciplinesService disciplinesService;

    @GetMapping("/disciplines")
    public List<AcademicDisciplines> showAllDisciplines(){
        List<AcademicDisciplines> allDisciplines = disciplinesService.showAllDisciplines();
        return allDisciplines;
    }

    @GetMapping("/disciplines/{id}")
    public AcademicDisciplines getDisciplines(@PathVariable("id") int id) {
        return disciplinesService.getDisciplines(id);
    }

    @PostMapping("/disciplines")
    public String saveDisciplines(@RequestBody AcademicDisciplines disciplines) {
        disciplinesService.saveDisciplines(disciplines);
        return "add disciplines success";
    }

    @PutMapping("/disciplines")
    public String updateDisciplines(@RequestBody AcademicDisciplines disciplines) {
        disciplinesService.saveDisciplines(disciplines);
        return "update disciplines success";
    }

    @DeleteMapping("/disciplines/{id}")
    public void deleteDisciplines(@PathVariable("id") int id) {
        disciplinesService.deleteDisciplines(id);
    }
}
