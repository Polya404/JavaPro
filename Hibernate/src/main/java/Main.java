import classes.Student;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.createStudent(new Student("Ivan Marchenko", "IC-189", "2019"));
        service.createStudent(new Student("Egor Ivanov", "WR-169", "2018"));
        service.createStudent(new Student("Iryna Sergeeva", "WR-169", "2018"));
        service.createStudent(new Student("Illya Antonov", "SB-185", "2020"));
        service.createStudent(new Student("Ihor Petrov", "SB-188", "2021"));
        service.createStudent(new Student("Sofia Krasnova", "BT-179", "2019"));


        //System.out.println(service.getStudentById(2));
        System.out.println(service.getStudentByName("Egor Ivanov"));
        //System.out.println(service.getAllStudents());
    }
}
