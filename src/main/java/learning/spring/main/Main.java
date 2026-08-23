package learning.spring.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee obj = ca.getBean("emp1", Employee.class);
		System.out.println(obj);
		
		ca.registerShutdownHook();
		
	}

}
