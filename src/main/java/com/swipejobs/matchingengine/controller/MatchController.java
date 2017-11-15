package com.swipejobs.matchingengine.controller;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;
import com.swipejobs.matchingengine.service.matcher.JobWorkersMatches;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MatchController {
    private static final Logger logger = LoggerFactory
            .getLogger(JobController.class);

    @Autowired
    private JobWorkersMatches matchService;

    @RequestMapping(method = RequestMethod.GET, value = "/matches")
    public ResponseEntity<List<String>> getJobs() throws RestException {
    	
        logger.debug("Received request to list of matches: ");
        return new ResponseEntity<>(matchService.getMatches(), HttpStatus.OK);
    
    }
}
