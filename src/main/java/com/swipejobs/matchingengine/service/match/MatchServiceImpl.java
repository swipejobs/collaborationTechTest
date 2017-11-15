package com.swipejobs.matchingengine.service.match;

import static java.util.Arrays.asList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
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
public class MatchServiceImpl implements MatchService {

	private static final Logger logger = LoggerFactory
			.getLogger(MatchServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AppConfig appConfig;

	public List<Match> getMatches() throws RestException
	{
		// Workers will be cached as per caching configs
		try
		{
			logger.debug("Retrieving matches API");
			Match[] matches = restTemplate
					.getForObject(appConfig.getMatchesUrl(), Match[].class);
			return asList(matches);
		} catch (Exception ex)
		{
			logger.error("Worker service error", ex);
			throw new RestException("Worker Service Error");
		}
	}
}
