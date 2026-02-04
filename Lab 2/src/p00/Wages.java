package p00;

public class Wages extends Employee{

	private double rate;
	private double hours;
	
	public Wages() {
		
	}
	
	public Wages(String id, String name, String address, String phone, long sin, String dob, String dept, double rate, double hours) {
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
	
	public double getPay() {
		if (hours > 40) {
			double ragularePay = rate * 40;
			double overtimePay = ((hours - 40) * rate * 1.5);
			return ragularePay + overtimePay;
		} else {
			return rate * hours;
		}
	}
	
	@Override
	public String toString() {
		return  id + ":" + name + ":" + address + ":" + phone + ":" + sin + ":" + dob + ":" + dept + ":" + rate +":"+ hours;
	}
	
}
