package com.swipejobs.matchingengine.controller;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;
import com.swipejobs.matchingengine.service.worker.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gnewitt
 * @version 1.0
 * @since 14/11/17.
 */
@RestController
class WorkerController {
    private static final Logger logger = LoggerFactory
            .getLogger(WorkerController.class);

	@Autowired
	private WorkerService workerService;

    /**
     * Return the list of workers
     *
     * @return a list of workers
     */
    @RequestMapping(method = RequestMethod.GET,
            value = "/workers")
    public ResponseEntity<List<Worker>> getWorkers() throws RestException
    {
        logger.debug("Received request to list workers: ");
        return new ResponseEntity<>(
                workerService.getWorkers(),
                HttpStatus.OK);
    }
}
