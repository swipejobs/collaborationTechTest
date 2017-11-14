package com.swipejobs.matchingengine.model.address;

/**
 * Domain model for the search address
 * 
 * @author adityachitre
 *
 */
public class SearchAddress {

	private Unit unit;

	private double maxJobDistance;

	private double longitude, latitude;

	/**
	 * @return returns the max distance for the job search
	 */
	public double getMaxJobDistance()
	{
		return maxJobDistance;
	}

	/**
	 * @param maxJobDistance
	 *            the max distance within which the job search is to be carried
	 *            out
	 */
	public void setMaxJobDistance(double maxJobDistance)
	{
		this.maxJobDistance = maxJobDistance;
	}

	/**
	 * @return the longitude of the address from where the job search radius is
	 *         drawn
	 */
	public double getLongitude()
	{
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to be set from where the job search radius is
	 *            drawn
	 */
	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	/**
	 * @return the latitude of the address from where the job search radius is
	 *         drawn
	 */
	public double getLatitude()
	{
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to be set from where the job search radius is
	 *            drawn
	 */
	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	/**
	 * @return the unit in which the job search distance is specified
	 */
	public Unit getUnit()
	{
		return unit;
	}

	/**
	 * @param unit
	 *            the unit of the job search distance to be set
	 */
	public void setUnit(Unit unit)
	{
		this.unit = unit;
	}
}
