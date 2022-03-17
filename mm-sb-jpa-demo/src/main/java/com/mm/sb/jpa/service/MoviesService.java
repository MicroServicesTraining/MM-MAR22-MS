/**
 * 
 */
package com.mm.sb.jpa.service;

import java.util.List;

import com.mm.sb.jpa.entities.Movie;

/**
 * @author ADMIN
 *
 */
public interface MoviesService {

	List<Movie> listMovies();

	Movie findMovieById(Long movieId);

	Movie addMovie(Movie movie);

	Movie modifyMoview(Movie movie);

	Boolean deleteMovie(Long movieId);

}
