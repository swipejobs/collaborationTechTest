package com.swipejobs.matchingengine.service.matcher;

import static java.util.Arrays.asList;

import java.util.ArrayList;
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
import com.swipejobs.matchingengine.model.worker.Worker;
import com.swipejobs.matchingengine.service.worker.WorkerServiceImpl;

/**
 * Implementation class for the worker service
 * 
 * @author Tom
 *
 */
@Service
public class JobWorkersMatchesImpl implements JobWorkersMatches {
	
	private static final Logger logger = LoggerFactory
			.getLogger(WorkerServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AppConfig appConfig;

	@Override
	public List<String> getMatches() throws RestException
	{
		// Workers will be cached as per caching configs
		try	{
			
			logger.debug("Retrieving workers from workers API");
			
			List<String> matches = new ArrayList<>();
			Job[] jobs = restTemplate.getForObject(appConfig.getJobsUrl(), Job[].class);
			Worker[] workers = restTemplate.getForObject(appConfig.getWorkersUrl(), Worker[].class);
			
			for(int w = 0; w < workers.length; w++) {
			
				Worker curWorker = workers[w];
				List<String> workerCerts = curWorker.getCertificates();
				
				for(int j = 0; j < jobs.length; j++) {
				
					Job curJob = jobs[j];
					List<String> jobCerts = curJob.getRequiredCertificates();
					
					boolean matchesCerts = true;
					for(int i = 0; i < jobCerts.size(); i++) {
						if(!workerCerts.contains(jobCerts.get(i))) {
							matchesCerts = false;
							break;
						}
					}
					
					if(matchesCerts) {
						matches.add("Worker " + curWorker.getUserId() + " matched Job:" + curJob.getJobId());
					}
					
				}
			}
			
			for(String s : matches) {
				logger.debug(s);
			}
			
			return matches;
			
		} catch (Exception ex) {
			logger.error("Worker service error", ex);
			throw new RestException("Worker Service Error");
		}
	}
}
