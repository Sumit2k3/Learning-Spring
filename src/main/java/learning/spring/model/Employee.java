package learning.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name, gender;
	
//	Field Injection
	@Autowired
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor Called");
	}

	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.Employee(3)");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
}
