package lesson20.dbService;

import com.mysql.cj.jdbc.MysqlDataSource;
import lesson20.dto.Student;
import lesson20.exception.UserNotFoundExeption;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBServiceImpl implements DBService {
    private Connection connection() throws SQLException {
        return DriverManager
                .getConnection("jdbc:mysql://localhost/student?allowPublicKeyRetrieval=true&useSSL=false"
                        + "&user=root&password=rootroot&serverTimezone=UTC");
    }

    @SneakyThrows
    @Override
    public int createStudent(Student student) {
        Connection connection = connection();
        Statement statement = connection.createStatement();
        String SQL = "insert into  students (FullName, GroupName, StartYear) value  ('%s', '%s', '%s')";
        return statement.executeUpdate(String.format(SQL, student.getFullName(), student.getGroupName(), student.getStartYear()));
    }

    @SneakyThrows
    @Override
    public void deleteStudent(Student student) {
        Connection connection = connection();
        Statement statement = connection.createStatement();
        String SQL = "delete from students where FullName='%s'";
        statement.execute(String.format(SQL, student.getFullName()));
    }

    @SneakyThrows
    @Override
    public List<Student> getAll() {
        Connection connection = connection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from students");

        List<Student> student = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String fullName = rs.getString("fullName");
            String groupName = rs.getString("groupName");
            String startYear = rs.getString("startYear");
            student.add(new Student(id, fullName, groupName, startYear));
        }
        connection.close();
        return student;
    }

    @SneakyThrows
    @Override
    public List<Student> getByName(String name) {
        Connection connection = connection();
        Statement statement = connection.createStatement();
        String SQL = "select * from students where fullName = '" + name + "'";
        ResultSet rs = statement.executeQuery(SQL);

        List<Student> student = new ArrayList<>();
        while (rs.next()) {
            int i = rs.getInt("id");
            String fullName = rs.getString("fullName");
            String groupName = rs.getString("groupName");
            String startYear = rs.getString("startYear");
            student.add(new Student(i, fullName, groupName, startYear));
        }
        connection.close();

        if (student.isEmpty()) {
            throw new UserNotFoundExeption(String.valueOf(name));
        } else {
            return student;
        }
    }

    @SneakyThrows
    @Override
    public List<Student> getByIds(List<Integer> ids) {
        String id = "";
        for (Integer i : ids) {
            id += i + ", ";
        }
        id = id.substring(0, id.lastIndexOf(","));
        Connection connection = connection();
        String SQL = "SELECT * FROM students WHERE id IN (%s)";
        Statement statement = connection().createStatement();
        ResultSet rs = statement.executeQuery(String.format(SQL, id));

        List<Student> student = new ArrayList<>();
        while (rs.next()) {
            int i = rs.getInt("id");
            String fullName = rs.getString("fullName");
            String groupName = rs.getString("groupName");
            String startYear = rs.getString("startYear");
            student.add(new Student(i, fullName, groupName, startYear));
        }
        connection.close();
        return student;
    }
}
