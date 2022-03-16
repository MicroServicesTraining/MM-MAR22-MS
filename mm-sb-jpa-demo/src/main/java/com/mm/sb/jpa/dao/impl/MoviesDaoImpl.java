/**
 * 
 */
package com.mm.sb.jpa.dao.impl;

import java.util.List;

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

}
