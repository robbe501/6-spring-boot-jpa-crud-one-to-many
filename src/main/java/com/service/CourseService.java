package com.service;

import java.util.List;

import com.entity.Course;
import com.vo.CourseVO;

public interface CourseService {

	public void createCourse(Course course);

	public List<CourseVO> readCourses();

	public void updateCourse(Course course);

	public void deleteCourse(String courseId);

	public String getIdByTitle(String title);
}
