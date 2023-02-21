package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpBusinessLogic;
import model.Employee;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployeeServlet")
public class addEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addEmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String employee = request.getParameter("employee"); 
		PrintWriter writer = response.getWriter();
		Employee emp = new Employee(employee); 
		EmpBusinessLogic data = new EmpBusinessLogic(); 
		data.insertEmployee(emp);
		writer.println("You entered: " + emp.toString());
		request.setAttribute("employee", emp);
		
		
	}

}
