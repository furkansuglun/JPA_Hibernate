package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@WebServlet("/employeeController")
public class EmployeeController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String employeeName = req.getParameter("name");
		String employeeSurname = req.getParameter("surname");
		int employeeSalary = Integer.parseInt(req.getParameter("salary"));
		//insert iþlemi
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.insertEmployee(employeeName, employeeSurname, employeeSalary);
		
		
		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);
		
		//sayfa yönlendirme 
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int employeeID = Integer.parseInt(req.getParameter("employeeId"));
		//burada gelen parametre a href teki link parametresi doget ile geliyor

		//delete iþlemi
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.removeEmployee(employeeID);
		
		
		
		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);
		
		//sayfa yönlendirme 
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);

		}

}

//controller --> service layer --> dao layer a ulasmalidir.

//domain layer a ulasim her yerden olabilir problem teskil etmez.

//bootstrap
//http://www.layoutit.com/
//https://datatables.net/examples/styling/bootstrap.html
//http://glyphicons.bootstrapcheatsheets.com/