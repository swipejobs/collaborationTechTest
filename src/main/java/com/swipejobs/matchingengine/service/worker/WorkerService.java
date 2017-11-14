package com.swipejobs.matchingengine.service.worker;

import java.util.List;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;

/**
 * Interface for the worker service
 * 
 * @author adityachitre
 *
 */
public interface WorkerService {

	/**
	 * Get a list of workers from the workers API
	 * 
	 * @return list of workers
	 */
	List<Worker> getWorkers() throws RestException;
}
