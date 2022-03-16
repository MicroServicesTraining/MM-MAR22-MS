/**
 * 
 */
package com.mm.sb.jpa.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.sb.jpa.entities.Movie;

/**
 * @author ADMIN
 *
 */
public interface MoviesRepository extends JpaRepository<Movie, Long> {

}
