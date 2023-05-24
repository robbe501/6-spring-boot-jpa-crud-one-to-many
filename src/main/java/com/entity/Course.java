package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@NamedQueries({
		@NamedQuery(name = "Course.readCourses", query = "SELECT new com.vo.CourseVO(c.courseId, c.title, c.description) FROM Course c"),
		@NamedQuery(name = "Course.getIdByTitle", query = "SELECT c.courseId FROM Course c WHERE c.title = :title"),

})
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "course_id")
	private String courseId;

	private String title;

	private String description;

	@OneToMany(mappedBy = "course", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Review> reviews = new ArrayList<>();

	public Course(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
