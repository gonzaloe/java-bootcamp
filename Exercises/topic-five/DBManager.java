

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
	private static final String drv = "com.mysql.jdbc.Driver";
	private static final String db = "jdbc:mysql://localhost:3306/high-school";
	private static final String user = "root";
	
	private Connection connection;
	private Statement statement;
	
	public DBManager(String password) {
		try {
			Class.forName(drv);
			connection = DriverManager.getConnection(db,user,password);
			statement = connection.createStatement();
			System.out.println("Connection was succesful");
		} catch(Exception e) {
			System.out.println("An error ocurred while attempting the connection");
		}
	}
	
	public String showStudents(String courseName) {
		String student = "";
		try{
			ResultSet resultSet = statement.executeQuery("select student_last_name, first_name from student_has_course join student on student.last_name = student_has_course.student_last_name " + "where student_has_course.course_name='" + courseName + "' order by student_has_course.student_last_name");
			while(resultSet.next()) {
				student += "\t" + resultSet.getString("student_last_name") + ", " + resultSet.getString("first_name") +  "\n";
			}
		} catch(Exception e) {
			System.out.println("An error ocurred trying to get the student name");
		}
		return student;
	}
	
	public String showCourse(String courseName) {
		String course = "";
		try{
			ResultSet resultSet = statement.executeQuery("select name from course" + " where name='" + courseName + "'");
			while(resultSet.next())
				course+=resultSet.getString("name");
		} catch(Exception e) {
			System.out.println("An error ocurred trying to get the course name");
		}
		
		return course;
	}
	
	public String showTeacher(String courseName) {
		String teacher = "";
		try{
			ResultSet resultSet = statement.executeQuery("select assigned_teacher from course" + " where name='" + courseName + "'");
			while(resultSet.next())
				teacher+=resultSet.getString("assigned_teacher");
		} catch(Exception e) {
			System.out.println("An error ocurred trying to get the teacher name");
		}
		return teacher;
	}
	
	public String getExerciseFour(String courseName) {
		String courseData = "";
		courseData += "Course: " + showCourse(courseName) + "\n";
		courseData += "Teacher: " + showTeacher(courseName) + "\n";
		courseData += "Students: \n" + showStudents(courseName) + "\n"; 
		return courseData;
	}
	
	public String getExerciseFive(String lastName) {
		String score = "Student: " + lastName + "\n";
		try{
			ResultSet resultSet = statement.executeQuery("select final_note, course from score" + " where student='" + lastName + "' order by final_note desc");
			while(resultSet.next())
				score+="Course: " + resultSet.getString("course") + "      ->Final Note: " + resultSet.getString("final_note") +"\n";
		} catch(Exception e) {
			System.out.println("An error ocurred trying to get the student notes");
		}
		return score;
	}
}
