import config.ApplicationConfiguration;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.List;

public class Application {
    

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

       // EmployeeService employeeService=new EmployeeServiceImpl();
        EmployeeService employeeService= applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println(employeeService.toString());

        EmployeeService employeeService1= applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println(employeeService1.toString());

        List<Employee> employees=employeeService.getAllEmployees();

        for (Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+ employee.getEmployeeLocation());
        }
    }
}
