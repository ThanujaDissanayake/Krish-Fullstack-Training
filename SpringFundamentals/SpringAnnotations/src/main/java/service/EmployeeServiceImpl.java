package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
        @Autowired
        EmployeeRepository employeeRepository;

        //Constructor injection
        @Autowired
        public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
            System.out.println("Överloaded constructor Executed");
            this.employeeRepository = employeeRepository;
        }

        public EmployeeServiceImpl() {
            System.out.println("Default Constructor Executed");
        }

        public EmployeeRepository getEmployeeRepository() {
            return employeeRepository;
        }

        @Autowired
        public void setEmployeeRepository(EmployeeRepository employeeRepository) {
            System.out.println("Setter Injection Fired");
            this.employeeRepository = employeeRepository;
        }

        @Override
        public List<Employee> getAllEmployees(){
            return employeeRepository.getAllEmployees();
        }
}

