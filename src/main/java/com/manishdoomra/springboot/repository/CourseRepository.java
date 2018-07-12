/**
 * 
 */
package com.manishdoomra.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manishdoomra.springboot.model.Course;

/**
 * @author mdoomra
 *
 */
public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);
}
