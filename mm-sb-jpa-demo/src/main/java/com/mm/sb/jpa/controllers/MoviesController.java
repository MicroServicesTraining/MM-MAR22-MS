/**
 * 
 */
package com.mm.sb.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/movieid/{id}")
	public Movie findMovieById(@PathVariable(name = "id") Long movieId) {
		return moviesService.findMovieById(movieId);
	}
	
	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		return moviesService.addMovie(movie);
	}
	
	@PutMapping
	public Movie modifyMovie(@RequestBody Movie movie) {
		return moviesService.modifyMoview(movie);
	}
	
	@DeleteMapping("/movieid/{id}")
	public Boolean deleteMovie(@PathVariable(name = "id") Long movieId) {
		return moviesService.deleteMovie(movieId);
	}
	
	
}
