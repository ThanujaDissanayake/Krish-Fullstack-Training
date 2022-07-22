package service;

import model.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

        private EmployeeRepository employeeRepository;

        //Constructor injection
        public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }

    public EmployeeServiceImpl() {
    }

    public EmployeeRepository getEmployeeRepository() {
            return employeeRepository;
        }

        public void setEmployeeRepository(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
        }

        @Override
        public List<Employee> getAllEmployees(){
            return employeeRepository.getAllEmployees();
        }
}

