package com.swipejobs.matchingengine.model.address;

/**
 * Domain model that represents a location
 * 
 * @author adityachitre
 *
 */
public class Location {

	private double longitude;
	private double latitude;

	/**
	 * @return the longitude of the location
	 */
	public double getLongitude()
	{
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to be set
	 */
	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	/**
	 * @return the latitude of the location
	 */
	public double getLatitude()
	{
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to be set
	 */
	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

}
