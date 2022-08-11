package lesson20.dto;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String fullName;
    private String groupName;
    private String startYear;

    public Student(String fullName, String groupName, String startYear) {
        this.fullName = fullName;
        this.groupName = groupName;
        this.startYear = startYear;
    }

    public Student() {
    }

    public Student(int id, String fullName, String groupName, String startYear) {
        this.id = id;
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
}
