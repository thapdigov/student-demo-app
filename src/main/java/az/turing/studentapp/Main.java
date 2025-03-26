package az.turing.studentapp;

import az.turing.studentapp.controller.StudentController;
import az.turing.studentapp.domain.repository.dao.StudentDao;
import az.turing.studentapp.domain.repository.dao.memory.StudentInMemoryDao;
import az.turing.studentapp.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentDao dao =
                new StudentInMemoryDao();
        //new StudentFileDao();
        //  new StudentPostgreDao();


        StudentService service = new StudentService(dao);

        StudentController controller = new StudentController(service);
    }
}