package p00;

public class PartTime extends Employee{
	
	private double rate;
	private double hours;
	
	public PartTime() {
		
	}
	
	public PartTime(String id, String name, String address, String phone, long sin, String dob, String dept, double rate, double hours) {
		super(id, name, address, phone, sin, dob, dept);
		this.rate = rate;
		this.hours = hours;
		
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double getPay() {
		return rate * hours;
	}

	
	public String toString() {
		return  id + ":" + name + ":" + address + ":" + phone + ":" + sin + ":" + dob + ":" + dept + ":" + rate +":"+ hours;
	}
	
	
}
