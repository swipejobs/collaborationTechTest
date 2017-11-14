package com.swipejobs.matchingengine.model.availability;

/**
 * Domain model for the availability in terms of days
 * 
 * @author adityachitre
 *
 */
public class Availability {

	private String title;

	private int dayIndex;

	/**
	 * @return the title of the day (Monday, Tuesday, etc)
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title
	 *            the title of the day to be set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the index of the day in the week
	 */
	public int getDayIndex()
	{
		return dayIndex;
	}

	/**
	 * @param dayIndex
	 *            the index of the day in the week to be set
	 */
	public void setDayIndex(int dayIndex)
	{
		this.dayIndex = dayIndex;
	}
}
