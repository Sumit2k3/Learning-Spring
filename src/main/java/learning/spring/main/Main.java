package learning.spring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.spring.model.Address;
import learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ioc = new AnnotationConfigApplicationContext("learning.spring");
		
		Employee bean = ioc.getBean(Employee.class);
		System.out.println(bean);
		
		bean.setName("Amit");
		System.out.println(bean);
		
		Address bean1 = ioc.getBean(Address.class);
		System.out.println(bean1);
	}
}
