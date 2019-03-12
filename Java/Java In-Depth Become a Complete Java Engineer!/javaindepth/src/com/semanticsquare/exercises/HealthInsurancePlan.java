package com.semanticsquare.exercises;

public class HealthInsurancePlan
{
    // Code for 'coverage' field goes here
    private Double coverage;
 
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}

	public Double getCoverage()
	{
		return coverage;
	}

	public void setCoverage(Double coverage)
	{
		this.coverage = coverage;
	}
}