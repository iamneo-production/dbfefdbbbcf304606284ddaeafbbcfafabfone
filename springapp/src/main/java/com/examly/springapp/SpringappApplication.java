package com.examly.springapp;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.cfg.Configuration;

// import javax.persistence.criteria.CriteriaBuilder;
// import javax.persistence.criteria.CriteriaQuery;
// import javax.persistence.criteria.Root;
// import java.util.List;

// import com.examly.springapp.model.Employee;


import java.util.*;
import java.io.*;

public class SpringappApplication {

    public static void main(String[] args) {
        // Configuration configuration = new Configuration().configure();
        // SessionFactory sessionFactory = configuration.buildSessionFactory();

        // try (Session session = sessionFactory.openSession()) {
        //     // Add some sample employee records
        //     addSampleEmployees(session);

        //     CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        //     CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        //     Root<Employee> root = criteriaQuery.from(Employee.class);

        //     criteriaQuery.select(root)
        //             .where(criteriaBuilder.gt(root.get("salary"), 3000.0));

        //     List<Employee> employees = session.createQuery(criteriaQuery).getResultList();

        //     System.out.println("Employees with salary greater than 3000:");
        //     for (Employee employee : employees) {
        //         System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: "
        //                 + employee.getSalary());
        //     }
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        // sessionFactory.close();

        System.out.print("hello world");
    }
}

//     private static void addSampleEmployees(Session session) {
//         session.beginTransaction();

//         Employee employee1 = new Employee(1001, "John Doe", 3500.0);
//         Employee employee2 = new Employee(1002, "Jane Smith", 2800.0);
//         Employee employee3 = new Employee(1003, "Alice Johnson", 4000.0);

//         session.save(employee1);
//         session.save(employee2);
//         session.save(employee3);

//         session.getTransaction().commit();
//     }
// }
