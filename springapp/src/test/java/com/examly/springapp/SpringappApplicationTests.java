package com.examly.springapp;

import com.examly.springapp.model.Employee;
import com.examly.springapp.EmployeeDAO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpringappApplicationTests {

	private SessionFactory sessionFactory;
	private EmployeeDAO employeeDAO;

	@Before
	public void setUp() {
		// Initialize Hibernate session factory
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();

		// Initialize EmployeeDAO
		employeeDAO = new EmployeeDAO(sessionFactory);

		// Add sample employees for testing
		addSampleEmployees();
	}

	@Test
	public void testGetEmployeesWithSalaryGreaterThan() {
		double salaryThreshold = 3000.0;

		List<Employee> result = employeeDAO.getEmployeesWithSalaryGreaterThan(salaryThreshold);

		// Assert that the result is not null and contains expected records
		assertEquals(2, result.size()); // Assuming two employees meet the criteria
	}

	@After
	public void tearDown() {
		// Clean up resources
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

	private void addSampleEmployees() {
		Employee employee1 = new Employee(1001, "John Doe", 3500.0);
		Employee employee2 = new Employee(1002, "Jane Smith", 2800.0);
		Employee employee3 = new Employee(1003, "Alice Johnson", 4000.0);

		// Add sample employees to the database
		employeeDAO.addEmployee(employee1);
		employeeDAO.addEmployee(employee2);
		employeeDAO.addEmployee(employee3);
	}
}
