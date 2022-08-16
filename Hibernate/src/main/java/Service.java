import classes.Student;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Service {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void createStudent(Student student) {
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();

    }

    public List<Student> getAllStudents() {
        session.beginTransaction();
        Query query = session.createQuery("from students");
        List<Student> list = (List<Student>) query.list();
        return list;
    }

    public List<Student> getStudentByName(String name) {
        session.beginTransaction();
        Query query = session.createQuery("from students where FullName = 'FullName'");
        query.setString("FullName", name);
        List<Student> list = (List<Student>) query.list();
        return list;
    }

    public List<Student> getStudentById(long id) {
        session.beginTransaction();
        Query query = session.createQuery("from students where id = 'id' ");
        query.setLong("id", id);
        List<Student> list = (List<Student>) query.list();
        return list;
    }
}
