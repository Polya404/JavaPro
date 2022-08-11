package lesson20;

import lesson20.bService.StudentService;
import lesson20.bService.StudentServiceImpl;
import lesson20.dto.GeneratedStudents;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(12);
        ids.add(11);
        StudentService studentService = new StudentServiceImpl();
        GeneratedStudents gs = new GeneratedStudents();
        System.out.println(studentService.getAll());
        studentService.deleteStudent(gs.student().get(0));
        System.out.println(studentService.getByIds(ids));
    }
}
