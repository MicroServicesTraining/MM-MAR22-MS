/**
 * 
 */
package com.mm.sb.jpa.dao;

import java.util.List;

import com.mm.sb.jpa.entities.Movie;

/**
 * @author ADMIN
 *
 */
public interface MoviesDao {

	List<Movie> listMovies();

	Movie findMovieById(Long movieId);

	Movie addMovie(Movie movie);

	Movie modifyMovie(Movie movie);

	Boolean deleteMovie(Long movieId);

}
