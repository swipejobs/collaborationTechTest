package com.swipejobs.matchingengine.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for the matching engine
 * 
 * @author adityachitre
 *
 */
@Configuration
public class AppConfig {

	// url for the jobs API
	@Value("${configuration.api.jobsUrl:http://testapi.com.au}")
	private String jobsUrl;

	// url for the workers API
	@Value("${configuration.api.workersUrl:http://testapi.com.au}")
	private String workersUrl;

	// url for the matches API
	@Value("${configuration.api.workersUrl:http://testapi.com.au}")
	private String matchesUrl;

	public String getJobsUrl()
	{
		return jobsUrl;
	}

	public void setJobsUrl(String jobsUrl)
	{
		this.jobsUrl = jobsUrl;
	}

	public String getWorkersUrl()
	{
		return workersUrl;
	}

	public void setWorkersUrl(String workersUrl)
	{
		this.workersUrl = workersUrl;
	}
	
	public String getMatchesUrl()
	{
		return matchesUrl;
	}

	public void setMatchesUrl(String matchesUrl)
	{
		this.matchesUrl = matchesUrl;
	}

}
