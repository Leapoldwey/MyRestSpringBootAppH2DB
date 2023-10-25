package com.example.myrestspringbootapph2db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "ACADEMIC_DISCIPLINES")
public class AcademicDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "weight")
    private int weight;

    public AcademicDisciplines(){}

    public AcademicDisciplines(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
}
