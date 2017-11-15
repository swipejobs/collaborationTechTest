package com.swipejobs.matchingengine.service.matcher;

import java.util.List;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;

/**
 * Interface for the worker service
 * 
 * @author Tom
 */
public interface JobWorkersMatches {

	List<String> getMatches() throws RestException;
}
