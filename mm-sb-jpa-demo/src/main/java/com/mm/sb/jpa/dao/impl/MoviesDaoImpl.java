/**
 * 
 */
package com.mm.sb.jpa.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.sb.jpa.dao.MoviesDao;
import com.mm.sb.jpa.dao.repositories.MoviesRepository;
import com.mm.sb.jpa.entities.Movie;

/**
 * @author ADMIN
 *
 */
@Component
public class MoviesDaoImpl implements MoviesDao {

	@Autowired
	private MoviesRepository moviesRepository;

	@Override
	public List<Movie> listMovies() {
		return moviesRepository.findAll();
	}

	@Override
	public Movie findMovieById(Long movieId) {
		Optional<Movie> result = moviesRepository.findById(movieId);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}
	}

	@Override
	public Movie addMovie(Movie movie) {
		return moviesRepository.save(movie);
	}

	@Override
	public Movie modifyMovie(Movie movie) {
		if(isPresent(movie)) {
			return moviesRepository.save(movie);
		}else {
			return null;
		}
	}

	private boolean isPresent(Movie movie) {
		return moviesRepository.findById(movie.getId()).isPresent();				
	}

	@Override
	public Boolean deleteMovie(Long movieId) {
		moviesRepository.deleteById(movieId);
		return true;
	}

}
