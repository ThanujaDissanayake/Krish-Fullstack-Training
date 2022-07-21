package repository;

import model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("employeeRepository")

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
    @Value("${name}")
    private String empName;
    @Value("${location}")
    private String empLocation;

        @Override
        public List<Employee> getAllEmployees(){
            List<Employee> employees= new ArrayList<>();

            Employee employee=new Employee();
            employee.setEmployeeName(empName);
            employee.setEmployeeLocation(empLocation);
            employees.add(employee);
            return employees;
        }
}

