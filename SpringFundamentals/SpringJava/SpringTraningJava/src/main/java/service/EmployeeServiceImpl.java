package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
       // @Autowired
        // Member variable injection with reflection
        EmployeeRepository employeeRepository;

        public EmployeeServiceImpl() {
            System.out.println("Default Constructor Executed");
        }

        public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
            System.out.println("Overloaded Constructor Executed");
            this.employeeRepository = employeeRepository;
        }

        public EmployeeRepository getEmployeeRepository() {
                return employeeRepository;
        }

        @Autowired
        //Setter injection
        public void setEmployeeRepository(EmployeeRepository employeeRepository) {
            System.out.println("Setter Executed");
            this.employeeRepository = employeeRepository;
        }

    @Override
        public List<Employee> getAllEmployees(){
            return employeeRepository.getAllEmployees();
        }
}

