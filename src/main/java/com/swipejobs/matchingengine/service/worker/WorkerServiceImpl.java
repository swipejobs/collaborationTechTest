package com.swipejobs.matchingengine.service.worker;

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
import com.swipejobs.matchingengine.model.worker.Worker;

/**
 * Implementation class for the worker service
 * 
 * @author adityachitre
 *
 */
@Service
public class WorkerServiceImpl implements WorkerService {

	private static final Logger logger = LoggerFactory
			.getLogger(WorkerServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AppConfig appConfig;

	@Override
	public List<Worker> getWorkers() throws RestException
	{
		// Workers will be cached as per caching configs
		try
		{
			logger.debug("Retrieving workers from workers API");
			Worker[] workers = restTemplate
					.getForObject(appConfig.getWorkersUrl(), Worker[].class);
			return asList(workers);
		} catch (Exception ex)
		{
			logger.error("Worker service error", ex);
			throw new RestException("Worker Service Error");
		}
	}
}
