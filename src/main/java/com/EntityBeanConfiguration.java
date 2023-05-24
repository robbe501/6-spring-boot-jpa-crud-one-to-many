package com;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.entity.Course;
import com.entity.Review;
import com.vo.ReviewVO;

@Configuration
public class EntityBeanConfiguration {

	@Bean(name = "getReview")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Review getReview() {
		return new Review();
	}

	@Bean(name = "getCourse")
	public Course getCourse() {
		return new Course();
	}

	@Bean(name = "getReviewVO")
	public ReviewVO getReviewVO() {
		return new ReviewVO();
	}

}
