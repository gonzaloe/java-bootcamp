// default package
// Generated 08-feb-2015 19:33:35 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "highschool")
public class Course implements java.io.Serializable {

	private CourseId id;
	private int hoursByWeek;
	private String scheduleTime;
	private Set<Student> students = new HashSet<Student>(0);
	private Teacher teacher;

	public Course() {
	}

	public Course(CourseId id, int hoursByWeek, String scheduleTime) {
		this.id = id;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime;
	}

	public Course(CourseId id, int hoursByWeek, String scheduleTime, Set<Student> students, Teacher teacher) {
		this.id = id;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime;
		this.students = students;
		this.teacher = teacher;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "name", column = @Column(name = "name", nullable = false, length = 45)),
			@AttributeOverride(name = "assignedTeacher", column = @Column(name = "assigned_teacher", nullable = false, length = 45)) })
	public CourseId getId() {
		return this.id;
	}

	public void setId(CourseId id) {
		this.id = id;
	}

	@Column(name = "hours_by_week", nullable = false)
	public int getHoursByWeek() {
		return this.hoursByWeek;
	}

	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	@Column(name = "schedule_time", nullable = false, length = 45)
	public String getScheduleTime() {
		return this.scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "student_has_course", catalog = "highschool", joinColumns = { @JoinColumn(name = "course_name", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "student_last_name", nullable = false, updatable = false) })
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "course")
	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}