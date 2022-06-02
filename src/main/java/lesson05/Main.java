package lesson05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University st1 = new University(1,"Ivan", "fix", "Ivanov", 2000,"Odessa","0674563872","CS", 2,"Y-134");
        University st2 = new University(2,"Iva", "fix", "Ivanov", 2004,"Odessa","0674563872","TS", 4,"Y-135");
        University st3 = new University(3,"Iv", "fix", "Ivanov", 2002,"Odessa","0674563872","ICS", 1,"Y-131");
        University st4 = new University(4,"Alex", "fix", "Ivanov", 2005,"Odessa","0674563872","CS", 3,"Y-134");
        University st5 = new University(5,"Ale", "fix", "Ivanov", 2001,"Odessa","0674563872","ICS", 1,"Y-134");
        University st6 = new University(6,"Ira", "fix", "Ivanov", 2003,"Odessa","0674563872","CS", 2,"Y-135");
        University st7 = new University(7,"Max", "fix", "Ivanov", 2003,"Odessa","0674563872","ICS", 2,"Y-131");
        University st8 = new University(8,"Illya", "fix", "Ivanov", 2002,"Odessa","0674563872","CS", 3,"Y-131");
        University st9 = new University(9,"Petr", "fix", "Ivanov", 2001,"Odessa","0674563872","TS", 1,"Y-135");
        University st10 = new University(10,"Marina", "fix", "Ivanov", 2000,"Odessa","0674563872","CS", 1,"Y-134");
        University.addStudentsToList(st1);
        University.addStudentsToList(st2);
        University.addStudentsToList(st3);
        University.addStudentsToList(st4);
        University.addStudentsToList(st5);
        University.addStudentsToList(st6);
        University.addStudentsToList(st7);
        University.addStudentsToList(st8);
        University.addStudentsToList(st9);
        University.addStudentsToList(st10);
        System.out.println(Arrays.toString(University.students));
        System.out.println();
        University.printFacultyList("CS", University.students);
        System.out.println();
        University.printFacultyAndCourseList("ICS",1, University.students );
        System.out.println();
        University.printOlderThen(2002, University.students);
        System.out.println();
        University.printGroupList("Y-131", University.students);
    }
}
