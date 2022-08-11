package lesson20.bService;

import lesson20.dto.Student;

import java.util.List;

public interface StudentService {
    int createStudent(Student student);
    void deleteStudent(Student student);
    List<Student> getAll();
    List<Student> getByName(String name);
    List<Student> getByIds(List<Integer> ids);
}
