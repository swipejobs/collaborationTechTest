package com.swipejobs.matchingengine.model.job;

import java.util.Date;
import java.util.List;

import com.swipejobs.matchingengine.model.address.Location;

/**
 * Domain model for the Job
 * 
 * @author adityachitre
 *
 */
public class Job {

	private Long jobId;

	private Boolean driverLicenseRequired;

	private Location location;

	private int workersRequired;

	private Date startDate;

	private List<String> requiredCertificates;

	private String guid;

	private String company;

	private String jobTitle;

	private String about;

	private String billRate;

	/**
	 * @return the id of the job
	 */
	public Long getJobId()
	{
		return jobId;
	}

	/**
	 * @param jobId
	 *            the id of the job to be set
	 */
	public void setJobId(Long jobId)
	{
		this.jobId = jobId;
	}

	/**
	 * @return boolean indicating whether the job requires a drivers license
	 */
	public Boolean getDriverLicenseRequired()
	{
		return driverLicenseRequired;
	}

	/**
	 * @param driverLicenseRequired
	 *            a boolean that sets whether the job requires a drivers license
	 */
	public void setDriverLicenseRequired(Boolean driverLicenseRequired)
	{
		this.driverLicenseRequired = driverLicenseRequired;
	}

	/**
	 * @return the location for the job
	 */
	public Location getLocation()
	{
		return location;
	}

	/**
	 * @param location
	 *            the location to be set for the job
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}

	/**
	 * @return int indicating the number of workers required for the job
	 */
	public int getWorkersRequired()
	{
		return workersRequired;
	}

	/**
	 * @param workersRequired
	 *            the number of workers required for the job to be set
	 */
	public void setWorkersRequired(int workersRequired)
	{
		this.workersRequired = workersRequired;
	}

	/**
	 * @return date indicating when the job is to start
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * @param startDate
	 *            the date to be set which determines when the job will start
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * @return a list of certificates which are required for the job
	 */
	public List<String> getRequiredCertificates()
	{
		return requiredCertificates;
	}

	/**
	 * @param requiredCertificates
	 *            list of strings specifying the certificates to be set for the
	 *            job
	 */
	public void setRequiredCertificates(List<String> requiredCertificates)
	{
		this.requiredCertificates = requiredCertificates;
	}

	/**
	 * @return the guid of the job
	 */
	public String getGuid()
	{
		return guid;
	}

	/**
	 * @param guid
	 *            the guid to be set
	 */
	public void setGuid(String guid)
	{
		this.guid = guid;
	}

	/**
	 * @return String indicating the name of the company
	 */
	public String getCompany()
	{
		return company;
	}

	/**
	 * @param company
	 *            the name of the company to be set
	 */
	public void setCompany(String company)
	{
		this.company = company;
	}

	/**
	 * @return the title of the job
	 */
	public String getJobTitle()
	{
		return jobTitle;
	}

	/**
	 * @param jobTitle
	 *            the title to be set for the job
	 */
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	/**
	 * @return String representing the information for the job
	 */
	public String getAbout()
	{
		return about;
	}

	/**
	 * @param about
	 *            the information that needs to be set for the job
	 */
	public void setAbout(String about)
	{
		this.about = about;
	}

	/**
	 * @return the rate for the job
	 */
	public String getBillRate()
	{
		// TODO Need to revisit the data type conversion if this is to be used
		// in matching
		return billRate;
	}

	/**
	 * @param billRate
	 *            the rate to be set for the job
	 */
	public void setBillRate(String billRate)
	{
		this.billRate = billRate;
	}
}
