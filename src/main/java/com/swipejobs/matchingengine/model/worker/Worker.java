package com.swipejobs.matchingengine.model.worker;

import java.util.List;

import com.swipejobs.matchingengine.model.address.SearchAddress;
import com.swipejobs.matchingengine.model.availability.Availability;

/**
 * Domain model for the worker
 * 
 * @author adityachitre
 *
 */
public class Worker {

	private Long userId;

	private int rating;

	private boolean isActive;

	private List<String> certificates;

	private SearchAddress jobSearchAddress;

	private boolean hasDriversLicense;

	private List<Availability> availability;

	/**
	 * @return the id of the worker
	 */
	public Long getUserId()
	{
		return userId;
	}

	/**
	 * @param userId
	 *            the id to be set for the worker
	 */
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	/**
	 * @return an int indicating the rating for the worker
	 */
	public int getRating()
	{
		return rating;
	}

	/**
	 * @param rating
	 *            the rating that needs to be set for the worker
	 */
	public void setRating(int rating)
	{
		this.rating = rating;
	}

	/**
	 * @return a list of certificates which are possessed by the worker
	 */
	public List<String> getCertificates()
	{
		return certificates;
	}

	/**
	 * 
	 * @param certificates
	 *            a list of strings indicating the certificates that are to be
	 *            set for the worker
	 */
	public void setCertificates(List<String> certificates)
	{
		this.certificates = certificates;
	}

	/**
	 * @return the address indicating a search zone for the worker
	 */
	public SearchAddress getJobSearchAddress()
	{
		return jobSearchAddress;
	}

	/**
	 * @param jobSearchAddress
	 *            the search zone address to be set for the worker
	 */
	public void setJobSearchAddress(SearchAddress jobSearchAddress)
	{
		this.jobSearchAddress = jobSearchAddress;
	}

	/**
	 * @return availability indicating the when the worker is available to work
	 */
	public List<Availability> getAvailability()
	{
		return availability;
	}

	/**
	 * @param availability
	 *            the availability to be set in terms of when the worker will be
	 *            available to work
	 */
	public void setAvailability(List<Availability> availability)
	{
		this.availability = availability;
	}

	/**
	 * @return boolean indicating whether the worker is active
	 */
	public boolean getIsActive()
	{
		return isActive;
	}

	/**
	 * @param isActive
	 *            the boolean to be set to indicate whether the worker is active
	 */
	public void setIsActive(boolean isActive)
	{
		this.isActive = isActive;
	}

	/**
	 * @return boolean indicating whether the worker has a drivers license
	 */
	public boolean getHasDriversLicense()
	{
		return hasDriversLicense;
	}

	/**
	 * @param hasDriversLicense
	 *            a boolean to be set to indicate whether the worker has a
	 *            drivers license
	 */
	public void setHasDriversLicense(boolean hasDriversLicense)
	{
		this.hasDriversLicense = hasDriversLicense;
	}
}
