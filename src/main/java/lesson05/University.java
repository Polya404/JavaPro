package lesson05;

public class University {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int yearOfBrith;
    private String address;
    private String number;
    private String faculty;
    private int course;
    private String groupName;
    public static University[] students = new University[10];
    private static int count = 0;

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearOfBrith=" + yearOfBrith +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", groupName='" + groupName + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBrith() {
        return yearOfBrith;
    }

    public void setYearOfBrith(int yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public University() {
    }

    public University(int id, String firstName, String lastName, String patronymic, int yearOfBrith, String address, String number, String faculty, int course, String groupName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBrith = yearOfBrith;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.course = course;
        this.groupName = groupName;
    }

    public static University[] addStudentsToList(University obj) {
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
        students[count] = new University(id, firstName, lastName, patronymic, yearOfBrith, address, number, faculty, course, groupName);
        count++;
        return students;
    }

    public static void printFacultyList(String faculty, University[] students) {
        for (University student : students)
            if (faculty.equals(student.getFaculty())) {
                System.out.println(student);
            }
    }

    public static void printFacultyAndCourseList(String faculty, int course, University[] students) {
        for (University student : students)
            if (faculty.equals(student.getFaculty()) & course == student.getCourse()) {
                System.out.println(student);
            }
    }

    public static void printOlderThen(int year, University[] students) {
        for (University student : students)
            if (year > student.getYearOfBrith()) {
                System.out.println(student);
            }
    }

    public static void printGroupList(String groupName, University[] students) {
        for (University student : students)
            if (groupName.equals(student.getGroupName())) {
                System.out.println(student);
            }
    }

}
