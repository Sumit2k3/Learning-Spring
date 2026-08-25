package learning.spring.model;

abstract public class Employee {
	
	private int id;
	private String name, gender;
	
	private Address address;
	
	public abstract Address applyAddress();
	
	public Employee() {
		System.out.println("Default Constructor Called Of Employee");
	}

	public Employee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Employee.Employee(4)");
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
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
