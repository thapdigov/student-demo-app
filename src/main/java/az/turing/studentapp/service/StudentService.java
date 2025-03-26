package az.turing.studentapp.service;

import az.turing.studentapp.domain.entity.StudentEntity;
import az.turing.studentapp.domain.repository.dao.StudentDao;

import java.util.List;

public class StudentService {

    private final StudentDao studentDao;


    public StudentService(StudentDao studentInMemoryDao) {
        this.studentDao = studentInMemoryDao;
    }


    public List<StudentEntity> findAll() {
        return (List<StudentEntity>) studentDao.getAll();
    }

    public StudentEntity save(StudentEntity student) {
        return studentDao.save(student);
    }
}
