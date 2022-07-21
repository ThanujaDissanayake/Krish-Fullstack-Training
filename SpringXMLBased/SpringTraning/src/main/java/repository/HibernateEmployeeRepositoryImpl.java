package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

        @Override
        public List<Employee> getAllEmployees(){
            List<Employee> employees= new ArrayList<>();

            Employee employee=new Employee();
            employee.setEmployeeName("Dissanayke");
            employee.setEmployeeLocation("Kegalle");
            employees.add(employee);
            return employees;
        }
}

