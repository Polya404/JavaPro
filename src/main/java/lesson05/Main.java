package lesson05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentList.addStudent();
        System.out.println(Arrays.toString(StudentList.students));
        System.out.println();
        StudentService.printFacultyList("CS", StudentList.students);
        System.out.println();
        StudentService.printFacultyAndCourseList("ICS",1, StudentList.students );
        System.out.println();
        StudentService.printOlderThen(2002, StudentList.students);
        System.out.println();
        StudentService.printGroupList("Y-131", StudentList.students);
    }
}
