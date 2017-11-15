package com.swipejobs.matchingengine.controller;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.worker.Worker;
import com.swipejobs.matchingengine.service.match.MatchService;
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
class MatchController {
    private static final Logger logger = LoggerFactory
            .getLogger(MatchController.class);

	@Autowired
	private MatchService matchServices;

    /**
     * Return the list of matches
     *
     * @return a list of matches
     */
    @RequestMapping(method = RequestMethod.GET,
            value = "/matches")
    public ResponseEntity<List<Match>> getMatches() throws RestException
    {
        logger.debug("Received request to list matches: ");
        return new ResponseEntity<List<Match>>(
                MatchService.getMatches(),
                HttpStatus.OK);
    }
}
