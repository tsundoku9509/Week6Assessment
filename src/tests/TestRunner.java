package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import model.Employee;

/**
 * @author ajlj - Austin Mays ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeLogic.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			}
		System.out.println(result.wasSuccessful());
	}
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
		}
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		if(employee.getMonthlySalary() < 10000) {
			appraisal = 500;
			} 
		else{appraisal = 1000;
		}
		return appraisal;}
}
