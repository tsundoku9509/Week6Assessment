package tests;
import model.EmpBusinessLogic;
import model.Employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @author ajlj - Austin Mays ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class TestEmployeeLogic {
	EmpBusinessLogic empBL= new EmpBusinessLogic();
	Employee employee = new Employee("Emily");
	@Before 
	public void setUp() throws Exception {	
	}
	@Test 
	public void testCalculateAppraisal() {
		employee.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
		}
	@Test
	public void testCalculateYearlySalary() {
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
		}
	@Test
	public void testEmployeeIsRetirementAge() {
		employee.setAge(70);assertTrue(empBL.isRetirementAge(employee));
		}
	@Test
	public void testEmployeeIsNotRetirementAge() {
		employee.setAge(25);assertFalse(empBL.isRetirementAge(employee));}
	}
