package az.turing.studentapp.controller;

import az.turing.studentapp.domain.entity.StudentEntity;
import az.turing.studentapp.service.StudentService;

import java.util.List;

public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    public List<StudentEntity> getAll() {
        return service.findAll();
    }
}
