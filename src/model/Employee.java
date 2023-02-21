package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ajlj - Austin Mays ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="Name")
	private String name;
	@Column(name="Salary Per Month")
	private double monthlySalary;
	@Column(name="Age")
	private int age;
	/**
	 * @return the name
	 */
	
	public Employee() {
		
	}
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	

}
