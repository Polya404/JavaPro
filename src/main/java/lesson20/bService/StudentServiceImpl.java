package lesson20.bService;

import lesson20.dbService.DBService;
import lesson20.dbService.DBServiceImpl;
import lesson20.dto.GeneratedStudents;
import lesson20.dto.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private DBService dbService = new DBServiceImpl();

    @Override
    public int createStudent(Student student) {
        return dbService.createStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        dbService.deleteStudent(student);
    }

    @Override
    public List<Student> getAll() {
        return dbService.getAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return dbService.getByName(name);
    }

    @Override
    public List<Student> getByIds(List<Integer> ids) {
        return dbService.getByIds(ids);
    }
}
