package lesson05;

public class StudentService {
    public static void printFacultyList(String faculty, Students[] students) {
        for (Students student : students)
            if (faculty.equals(student.getFaculty())) {
                System.out.println(student);
            }
    }

    public static void printFacultyAndCourseList(String faculty, int course, Students[] students) {
        for (Students student : students)
            if (faculty.equals(student.getFaculty()) & course == student.getCourse()) {
                System.out.println(student);
            }
    }

    public static void printOlderThen(int year, Students[] students) {
        for (Students student : students)
            if (year > student.getYearOfBrith()) {
                System.out.println(student);
            }
    }

    public static void printGroupList(String groupName, Students[] students) {
        for (Students student : students)
            if (groupName.equals(student.getGroupName())) {
                System.out.println(student);
            }
    }
}
