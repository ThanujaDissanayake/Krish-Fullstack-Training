package config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import repository.EmployeeRepository;
import repository.HibernateEmployeeRepositoryImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@Configuration
@ComponentScan("SpringTrainingJava")
@PropertySource("application.properties")
public class ApplicationConfiguration {

    @Bean(name = "employeeService")
    //@Scope("singleton")
    @Scope("prototype")
    public EmployeeService getEmployeeService(){
       //return new EmployeeServiceImpl();

        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();

        // Wiring with setters & Constructors
        //EmployeeServiceImpl employeeService1=new EmployeeServiceImpl(getEmployeeRepository());
       //employeeService.setEmployeeRepository(getEmployeeRepository());

        return employeeService;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }
}
