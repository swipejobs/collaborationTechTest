package com.swipejobs.matchingengine.service.job;

import java.util.List;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.job.Job;

/**
 * Interface for the job service
 * 
 * @author adityachitre
 *
 */
public interface JobService {

	/**
	 * Get a list of jobs from the jobs API
	 * 
	 * @return list of jobs
	 */
	List<Job> getJobs() throws RestException;

}
