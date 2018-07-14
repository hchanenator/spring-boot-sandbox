/**
 * Simple controller for root path
 * 
 */
package com.ofg.springbootsandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author herb.chan
 *
 */

@RestController
public class HomeController {

	@GetMapping
	public String greeting(@RequestParam(required=false, defaultValue="") String name) {
		return name.equals("") ? "Hey! " : " Hey, " + name + "!";
	}
}
