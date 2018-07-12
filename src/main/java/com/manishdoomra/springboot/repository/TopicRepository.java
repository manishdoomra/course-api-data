/**
 * 
 */
package com.manishdoomra.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.manishdoomra.springboot.model.Topic;

/**
 * @author mdoomra
 *
 */
public interface TopicRepository extends CrudRepository<Topic, String>{

}
