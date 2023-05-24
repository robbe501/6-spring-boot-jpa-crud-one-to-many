package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
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
		@NamedQuery(name = "Review.readReviews", query = "SELECT new com.vo.ReviewVO(r.reviewId, r.text) FROM Review r"),
		@NamedQuery(name = "Review.readCourseReviewByCourse", query = "SELECT new com.vo.ReviewVO(r.reviewId, r.text) FROM Review r JOIN course c WHERE c.courseId = :courseId")

})
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "review_id")
	private Integer reviewId;

	private String text;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Course course;

	public Review(String text) {
		this.text = text;
	}

}
