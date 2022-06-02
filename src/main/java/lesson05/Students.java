package lesson05;

public class Students {
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

    public Students() {
    }

    public Students(int id, String firstName, String lastName, String patronymic, int yearOfBrith, String address, String number, String faculty, int course, String groupName) {
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





}
