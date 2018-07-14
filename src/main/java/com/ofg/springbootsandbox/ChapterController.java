/**
 * 
 */
package com.ofg.springbootsandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author herb.chan
 *
 */
@RestController
public class ChapterController {

	private final ChapterRepository repository;
	
	public ChapterController(ChapterRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/chapters")
	public Flux<Chapter> listing() {
		return repository.findAll();
	}
	
	@GetMapping("/chapters/detail")
	public String findChapter(@RequestParam(required=true, defaultValue="") String name) {
		Mono<Chapter> chapter= repository.findByName(name);
		return chapter.toString();
	}
}
