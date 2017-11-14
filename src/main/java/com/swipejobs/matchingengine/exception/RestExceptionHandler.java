package com.swipejobs.matchingengine.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Exception handler for the application
 * 
 * @author adityachitre
 *
 */
@ControllerAdvice
public class RestExceptionHandler {
	
	private static final Logger logger = LoggerFactory
			.getLogger(RestExceptionHandler.class);

	/**
	 * Handles the RestException error thrown by the application
	 * 
	 * @param rex
	 *            the RestException object
	 * @return an ExceptionResponse encapsulating the error
	 */
	@ExceptionHandler(RestException.class)
	public ResponseEntity<ExceptionResponse> handleRestExceptions(
			RestException rex)
	{
		logger.debug("Exception", rex);
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("RESOURCE_NOT_FOUND");
		response.setErrorMessage(rex.getMessage());

		return new ResponseEntity<ExceptionResponse>(response,
				HttpStatus.NOT_FOUND);
	}

	/**
	 * Handles all exceptions other than the RestException
	 * 
	 * @return an ExceptionResponse encapsulating the error
	 */
	@ExceptionHandler(value = { Exception.class, RuntimeException.class })
	public ResponseEntity<ExceptionResponse> handleUnexpectedExceptions(Throwable t)
	{
		logger.debug("Unexpected error", t);
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("GLOBAL_ERROR_CODE");
		response.setErrorMessage("GLOBAL_ERROR_MESSAGE");

		return new ResponseEntity<ExceptionResponse>(response,
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}