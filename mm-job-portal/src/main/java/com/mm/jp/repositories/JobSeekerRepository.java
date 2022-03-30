/**
 * 
 */
package com.mm.jp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mm.jp.entities.JobSeeker;

/**
 * @author dorak
 *
 */
@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {

}
