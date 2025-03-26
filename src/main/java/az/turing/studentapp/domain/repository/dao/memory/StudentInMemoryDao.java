package az.turing.studentapp.domain.repository.dao.memory;

import az.turing.studentapp.domain.entity.StudentEntity;
import az.turing.studentapp.domain.repository.dao.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentInMemoryDao extends StudentDao {


    public final List<StudentEntity> STUDENT_LIST = new ArrayList<StudentEntity>();

    public List<StudentEntity> getAll() {
        return STUDENT_LIST;
    }

    public StudentEntity save(StudentEntity student) {
        STUDENT_LIST.add(student);
        return student;
    }

    public StudentEntity getByIndex(Integer id) {
        return STUDENT_LIST.get(id);
    }
}
