package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author ajlj - Austin Mays ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
public class EmpBusinessLogic {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Employees");
	public void insertEmployee(Employee emp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		em.close();
	}
	public double calculateYearlySalary(Employee employee) {
		return 0.0;
		}
	public double calculateAppraisal(Employee employee) {
		return 0.0;}
	public boolean isRetirementAge(Employee employee) {
		int employ = 0;
		int retire = 65;
		boolean retiring = true;
		while(employ>retire) {
			return retiring;
		}
		return false;
		}

}
