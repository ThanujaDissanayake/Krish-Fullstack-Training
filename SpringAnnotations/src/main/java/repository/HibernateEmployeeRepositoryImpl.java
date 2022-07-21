package repository;

import model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("employeeRepository")
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

