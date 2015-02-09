
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {
	private Course course;
	private Student student;
	private Teacher teacher;
	private List<Student> listofStudents;
	private List<Teacher> listofTeachers; 
	private List<Course> listofCourses;
	
	public Store(Course course, Student student, Teacher teacher) {
		super();
		this.course = course;
		this.student = student;
		this.teacher = teacher;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void put() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(this.student);
		session.save(this.course);
		session.save(this.teacher);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Student> fetchAllStudents() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		this.listofStudents = session.createQuery("select * from student").list();
		session.getTransaction().commit();
		session.close();
		return this.listofStudents;	
	}
	
	public List<Teacher> fetchAllTeachers() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		this.listofTeachers = session.createQuery("select * from teacher").list();
		session.getTransaction().commit();
		session.close();
		return this.listofTeachers;	
	}
	
	public List<Course> fetchAllCourses() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		this.listofCourses = session.createQuery("select * from course").list();
		session.getTransaction().commit();
		session.close();
		return this.listofCourses;	
	}
	
	public List<Course> fetchCourseByStudent(String studentLastName) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		this.listofCourses = session.createQuery("select course from student_has_course where student_has_course.last_name='" + studentLastName + "'").list();
		session.getTransaction().commit();
		session.close();
		return this.listofCourses;	
	}
	
	public List<Student> fetchStudentByCourse(String courseName) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		this.listofStudents = session.createQuery("select student from student_has_course where student_has_course.course_name='" + courseName + "'").list();
		session.getTransaction().commit();
		session.close();
		return this.listofStudents;	
	}
}
