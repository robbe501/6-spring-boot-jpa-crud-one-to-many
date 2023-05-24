package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Review;
import com.vo.ReviewVO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ReviewRepositoryImpl implements ReviewRepository {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void createReview(Review review) {
		em.persist(review);
	}

	@Override
	public List<ReviewVO> readReviews() {
		return em.createNamedQuery("Review.readReviews", ReviewVO.class).getResultList();
	}

	@Override
	public void updateReview(Review review) {
		em.merge(review);

	}

	@Override
	public void deleteReview(Integer reviewId) {
		Review r = em.find(Review.class, reviewId);
		r.getCourse().getReviews().remove(r);
		em.remove(r);
	}

}
