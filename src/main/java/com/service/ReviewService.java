package com.service;

import java.util.List;

import com.entity.Review;
import com.vo.ReviewVO;

public interface ReviewService {
	public void createReview(Review review);

	public List<ReviewVO> readReviews();

	public void updateReview(Review review);

	public void deleteReview(Integer reviewId);
}
