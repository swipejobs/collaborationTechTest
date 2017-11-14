package com.swipejobs.matchingengine.exception;

/**
 * Exception class for REST operations
 * 
 * @author adityachitre
 *
 */
public class RestException extends Exception {

	private static final long serialVersionUID = 1L;

	public RestException(String message)
	{
		super(message);
	}

}
