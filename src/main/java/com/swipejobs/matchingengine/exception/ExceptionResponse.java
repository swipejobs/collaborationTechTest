package com.swipejobs.matchingengine.exception;

/**
 * Bean that encapsulates and exception response
 * 
 * @author adityachitre
 *
 */
public class ExceptionResponse {

	private String errorCode;
	private String errorMessage;

	/**
	 * @return an error code signifying the exception occurred
	 */
	public String getErrorCode()
	{
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the error code to be set
	 */
	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	/**
	 * @return a message signifying the exception occurred
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the message to be set
	 */
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
