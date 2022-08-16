package classes;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "start_year")
    private String startYear;

    public Student() {
    }

    public Student(String fullName, String groupName, String startYear) {
        this.fullName = fullName;
        this.groupName = groupName;
        this.startYear = startYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", startYear='" + startYear + '\'' +
                '}';
    }
}
