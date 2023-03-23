/**
 * 
 */
package com.karosanpu.holaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ksanchezpu
 *
 */
@RestController
public class HomeController {

	@GetMapping("/")
	public String inicio() {
		return "Hola Mundo";
	}
}
