/**
 * 
 */
package com.mm.sb.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.sb.jpa.dao.MoviesDao;
import com.mm.sb.jpa.entities.Movie;
import com.mm.sb.jpa.service.MoviesService;

/**
 * @author ADMIN
 *
 */
@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDao moviesDao;

	@Override
	public List<Movie> listMovies() {
		return moviesDao.listMovies();
	}

	@Override
	public Movie findMovieById(Long movieId) {
		return moviesDao.findMovieById(movieId);
	}

	@Override
	public Movie addMovie(Movie movie) {
		return moviesDao.addMovie(movie);
	}

	@Override
	public Movie modifyMoview(Movie movie) {
		return moviesDao.modifyMovie(movie);
	}

	@Override
	public Boolean deleteMovie(Long movieId) {
		return moviesDao.deleteMovie(movieId);
	}

}
