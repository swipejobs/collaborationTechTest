package com.swipejobs.matchingengine.service.match;

import java.util.List;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;

/**
 * Interface for the worker service
 * 
 * @author adityachitre
 *
 */
public interface MatchService {

	/**
	 * Get a list of workers from the workers API
	 * 
	 * @return list of workers
	 */
	static List<Match> getMatches() throws RestException {
		// TODO Auto-generated method stub
		return null;
	}
}
