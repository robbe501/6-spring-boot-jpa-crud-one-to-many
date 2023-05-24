package com.repository;

import java.util.List;

import com.entity.Review;
import com.vo.ReviewVO;

public interface ReviewRepository {
	public void createReview(Review review);

	public List<ReviewVO> readReviews();

	public void updateReview(Review review);

	public void deleteReview(Integer reviewId);
}
