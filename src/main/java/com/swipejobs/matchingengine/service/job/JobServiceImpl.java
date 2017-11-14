package com.swipejobs.matchingengine.service.job;

import static java.util.Arrays.asList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swipejobs.matchingengine.config.AppConfig;
import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.job.Job;

/**
 * Service class that calls the jobs API
 * 
 * @author adityachitre
 *
 */
@Service
public class JobServiceImpl implements JobService {

	private static final Logger logger = LoggerFactory
			.getLogger(JobServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AppConfig appConfig;

	public List<Job> getJobs() throws RestException
	{
		// Jobs will be cached as per caching configs
		try
		{
			logger.debug("Retrieving jobs from jobs API");
			Job[] jobs = restTemplate.getForObject(appConfig.getJobsUrl(),
					Job[].class);
			return asList(jobs);
		} catch (Exception ex)
		{
			logger.error("Job Service Error", ex);
			throw new RestException("Job Service Error");
		}
	}

}
