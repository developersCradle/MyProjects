package com.semanticsquare.exercises;

public class Billing
{

	//1. Insurance conpany would pay
	//2. Patient would pay
	// ammount = patient is billed BEFORE applying insurance
    public static double[] computePaymentAmount(Patient patient, double amount) {
    	
    	double[] payments = new double[2];  
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        if (patientInsurancePlan == null)
		{
        	patientInsurancePlan = new HealthInsurancePlan();
        	patientInsurancePlan.setCoverage(0.0);
		}
        payments[0] = amount * patientInsurancePlan.getCoverage();    //Insurance company would pay  
      
        int discound = 20;
        
        if (patientInsurancePlan instanceof PlatinumPlan)
		{
        	discound = 50;
		}
        else if (patientInsurancePlan instanceof GoldPlan) {
        	discound = 40;
		}
        else if (patientInsurancePlan instanceof SilverPlan) {
        	discound = 30;
		}
        else if (patientInsurancePlan instanceof BronzePlan) {
        	discound = 25;
		}
        
        payments[1] = ( amount - payments[0]) - discound;
        return payments;
    }
    
    public static void main(String[] args)
	{
    	HealthInsurancePlan insurancePlan = null;
    	Patient patient = new Patient();
    	patient.setInsurancePlan(insurancePlan);
    	
    	
    	
    	double[] payments = Billing.computePaymentAmount(patient, 1000.0);
    	
    	for (double d : payments)
		{
			System.out.println(d);
		}    	
	}
    
}
