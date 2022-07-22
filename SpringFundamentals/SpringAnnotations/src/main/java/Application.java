import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.List;

public class Application {
    //private static Object ApplicationContext;

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService=new EmployeeServiceImpl();
        //EmployeeService employeeService= applicationContext.getBean("employeeService", EmployeeService.class);

        List<Employee> employees=employeeService.getAllEmployees();

        for (Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+ employee.getEmployeeLocation());
        }
    }
}
