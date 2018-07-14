/**
 * 
 */
package com.ofg.springbootsandbox;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;

/**
 * @author herb.chan
 *
 */
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

//	public Chapter findByName(String name);
	
	@Query("{ 'name': ?0 }")
	Mono<Chapter> findByName(String name);
}
