package com.oalquaseer.junit;

public class EmpBusinessLogic {
   
	// Calculate the yearly salary of employee
   public double calculateYearlySalary(Employee Employee){
      double yearlySalary=0;
      yearlySalary = Employee.getMonthlySalary() * 12;
      return yearlySalary;
   }
	
   // Calculate the appraisal amount of employee
   public double calculateAppraisal(Employee Employee){
      double appraisal=0;
      if(Employee.getMonthlySalary() < 10000){
         appraisal = 500;
      }else{
         appraisal = 1000;
      }
      return appraisal;
   }
}