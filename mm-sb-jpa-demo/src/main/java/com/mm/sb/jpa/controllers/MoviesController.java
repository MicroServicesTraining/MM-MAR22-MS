/**
 * 
 */
package com.mm.sb.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.jpa.entities.Movie;
import com.mm.sb.jpa.service.MoviesService;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/api/v1/movies")
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;

	@GetMapping
	public List<Movie> listMovies() {
		return moviesService.listMovies();	
	}
}
