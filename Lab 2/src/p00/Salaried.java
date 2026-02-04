package p00;

public class Salaried extends Employee{
	
	private double salary;
	
	public Salaried() {
		
	}
	
	public Salaried(String id, String name, String address, String phone, long sin, String dob, String dept, double salary) {
		super(id, name, address, phone, sin, dob, dept);
		this.salary = salary;
		
	}
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  id + ":" + name + ":" + address + ":" + phone + ":" + sin + ":" + dob + ":" + dept + ":" + salary;
	}
	
}
