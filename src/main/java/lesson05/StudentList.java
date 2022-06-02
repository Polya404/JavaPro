package lesson05;

public class StudentList {
    public static Students[] students = new Students[10];
    private static int count = 0;

    private static Students[] getStudents(Students obj) {
        int id = obj.getId();
        String firstName = obj.getFirstName();
        String lastName = obj.getLastName();
        String patronymic = obj.getPatronymic();
        int yearOfBrith = obj.getYearOfBrith();
        String address = obj.getAddress();
        String number = obj.getNumber();
        String faculty = obj.getFaculty();
        int course = obj.getCourse();
        String groupName = obj.getGroupName();
        students[count] = new Students(id, firstName, lastName, patronymic, yearOfBrith, address, number, faculty, course, groupName);
        count++;
        return students;
    }

    public static void addStudent(){
        Students st1 = new Students(1,"Ivan", "fix", "Ivanov", 2000,"Odessa","0674563872","CS", 2,"Y-134");
        Students st2 = new Students(2,"Iva", "fix", "Ivanov", 2004,"Odessa","0674563872","TS", 4,"Y-135");
        Students st3 = new Students(3,"Iv", "fix", "Ivanov", 2002,"Odessa","0674563872","ICS", 1,"Y-131");
        Students st4 = new Students(4,"Alex", "fix", "Ivanov", 2005,"Odessa","0674563872","CS", 3,"Y-134");
        Students st5 = new Students(5,"Ale", "fix", "Ivanov", 2001,"Odessa","0674563872","ICS", 1,"Y-134");
        Students st6 = new Students(6,"Ira", "fix", "Ivanov", 2003,"Odessa","0674563872","CS", 2,"Y-135");
        Students st7 = new Students(7,"Max", "fix", "Ivanov", 2003,"Odessa","0674563872","ICS", 2,"Y-131");
        Students st8 = new Students(8,"Illya", "fix", "Ivanov", 2002,"Odessa","0674563872","CS", 3,"Y-131");
        Students st9 = new Students(9,"Petr", "fix", "Ivanov", 2001,"Odessa","0674563872","TS", 1,"Y-135");
        Students st10 = new Students(10,"Marina", "fix", "Ivanov", 2000,"Odessa","0674563872","CS", 1,"Y-134");
        StudentList.getStudents(st1);
        StudentList.getStudents(st2);
        StudentList.getStudents(st3);
        StudentList.getStudents(st4);
        StudentList.getStudents(st5);
        StudentList.getStudents(st6);
        StudentList.getStudents(st7);
        StudentList.getStudents(st8);
        StudentList.getStudents(st9);
        StudentList.getStudents(st10);
    }
}
