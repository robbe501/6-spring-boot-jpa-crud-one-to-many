package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Course;
import com.entity.Review;
import com.vo.ReviewVO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CourseReviewRepositoryImpl implements CourseReviewRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void createCourseReviews(Course course, List<Review> reviews) {
		em.persist(course);
		for (Review r : reviews) {
			r.setCourse(course);
			em.persist(r);
		}

	}

	@Override
	public List<ReviewVO> readCourseReviewByCourse(String courseId) {

		return em.createNamedQuery("Review.readCourseReviewByCourse", ReviewVO.class).setParameter("courseId", courseId)
				.getResultList();
	}

	@Override
	public void updateCourseReview(Review review) {
		// TODO Auto-generated method stub

	}

}
