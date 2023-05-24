package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Course;
import com.entity.Review;
import com.service.CourseReviewService;
import com.service.CourseService;
import com.service.ReviewService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CourseService courseService;

	@Autowired
	private ReviewService reviewService;

	@Autowired
	private CourseReviewService courseReviewService;

	@Resource(name = "getCourse")
	private Course c;

	@Resource(name = "getReview")
	private Review r1;

	@Resource(name = "getReview")
	private Review r2;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// --------------- CRUD COURSE ------------------

//		// Inserisco corso Full Stack
		c.setTitle("Full Stack");
		c.setDescription("Web Dev course");
		courseService.createCourse(c);
//
//		// Resetto l'id e inserisco corso SF
//		c.setCourseId(null);
//		c.setTitle("SF");
//		c.setDescription("Salesforce course");
//		courseService.createCourse(c);
//
//		// Update corso SF in Salesforce
//		c.setTitle("Salesforce");
//		courseService.updateCourse(c);
//
//		c.setCourseId(null);
//		c.setTitle("Cloud");
//		c.setDescription("Cloud course");
//		courseService.createCourse(c);
//
//		// Delete corso Full Stack
//		courseService.deleteCourse(courseService.getIdByTitle("Full Stack"));
//
//		courseService.readCourses().forEach(System.out::println);
//
		// --------------- CRUD REVIEW ------------------
		r1.setCourse(c);
		r1.setText("Nice course");
		reviewService.createReview(r1);
//
//		r.setReviewId(null);
//		r.setText("Good course");
//		reviewService.createReview(r);
//
//		r.setReviewId(null);
//		r.setText("Love it");
//		reviewService.createReview(r);
//
//		r.setText("Comment");
//
//		reviewService.updateReview(r);
//
//		reviewService.deleteReview(1);
//
		// --------------- CRUD COURSE REVIEW ------------------
//		reviewService.readReviews().forEach(System.out::println);
//
//		// Creo corso Full Stack
//		c.setTitle("Full Stack");
//		c.setDescription("Web Dev course");
//
//		// Creo due recensioni prova
//		r1.setText("Prova1");
//		r2.setText("Prova2");
//
//		// Inserisco le recensioni in una lista
//		List<Review> reviews = new ArrayList<>();
//		reviews.add(r1);
//		reviews.add(r2);
//
//		// Inserisco corso e recensioni
//		courseReviewService.createCourseReviews(c, reviews);
//
//		// Ricerca delle recensioni per id di un corso
//		courseReviewService.readCourseReviewByCourse(c.getCourseId()).forEach(System.out::println);
//
//		// Resetto l'id e inserisco corso SF
//		c.setCourseId(null);
//		c.setTitle("SF");
//		c.setDescription("Salesforce course");
//		courseService.createCourse(c);
//
//		r1.setCourse(c);
//		reviewService.updateReview(r1);
//
//		
//		// Controllo che il delete di un corso cancelli anche le recensioni associate
//		courseService.deleteCourse(c.getCourseId());

	}

}
