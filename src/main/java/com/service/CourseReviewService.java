package com.service;

import java.util.List;

import com.entity.Course;
import com.entity.Review;
import com.vo.ReviewVO;

public interface CourseReviewService {

	public void createCourseReviews(Course course, List<Review> reviews);

	public List<ReviewVO> readCourseReviewByCourse(String courseId);

	public void updateCourseReview(Review review);
}
