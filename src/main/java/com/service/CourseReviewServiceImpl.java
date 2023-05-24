package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Course;
import com.entity.Review;
import com.repository.CourseReviewRepository;
import com.vo.ReviewVO;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;

@Service
public class CourseReviewServiceImpl implements CourseReviewService {

	@Autowired
	private CourseReviewRepository courseReviewRepository;

	@Override
	public void createCourseReviews(Course course, List<Review> reviews) {
		try {
			courseReviewRepository.createCourseReviews(course, reviews);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

	}

	@Override
	public List<ReviewVO> readCourseReviewByCourse(String courseId) {
		List<ReviewVO> reviews = new ArrayList<>();
		try {
			reviews = courseReviewRepository.readCourseReviewByCourse(courseId);
			System.out.println("Info: Transazione riuscita.");
		} catch (EntityExistsException | IllegalArgumentException | TransactionRequiredException e) {
			e.printStackTrace();
			System.err.println("Errore: Transazione fallita.");
		}

		return reviews;
	}

	@Override
	public void updateCourseReview(Review review) {
		// TODO Auto-generated method stub

	}

}
