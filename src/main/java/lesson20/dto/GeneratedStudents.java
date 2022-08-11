package lesson20.dto;

import java.util.ArrayList;
import java.util.List;

public class GeneratedStudents {

    private List<Student> student = new ArrayList<>();

    public List<Student> student (){
        student.add(new Student("Ihor Marchenko", "fl-128","2008"));
        student.add(new Student("Illya Petrov", "xz-126","2005"));
        student.add(new Student("Max Ivanov", "rp-168","2006"));
        student.add(new Student("Iryna Sergeeva", "mx-128","2008"));
        student.add(new Student("Danylo Victorov", "lp-121","2004"));
        student.add(new Student("Maryna Ivanova", "fl-128","2018"));
        return student;
    }
}
