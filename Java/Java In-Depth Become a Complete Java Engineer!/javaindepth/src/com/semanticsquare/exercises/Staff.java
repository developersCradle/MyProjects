package com.semanticsquare.exercises;

public class Staff extends User
{

	private long staffId;
	private int yearsOfExpreriance;
	private String description;
	private double salary;
	
	
	public long getStaffId()
	{
		return staffId;
	}
	public void setStaffId(long staffId)
	{
		this.staffId = staffId;
	}
	public int getYearsOfExpreriance()
	{
		return yearsOfExpreriance;
	}
	public void setYearsOfExpreriance(int yearsOfExpreriance)
	{
		this.yearsOfExpreriance = yearsOfExpreriance;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
}
