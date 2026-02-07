package p00;

public class Employee {
	
//	private static ArrayList<Employee> employee = new ArrayList<>();
	
	// Attributes
	String id;
	String name;
	String address;
	String phone;
	long sin;
	String dob;
	String dept;
	
	
	public Employee() {

	}
	
	public Employee(String id, String name, String address, String phone, long sin, String dob, String dept) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sin = sin;
		this.dob = dob;
		this.dept = dept;
	}

	
//	private void loadEmployeeList() {
//		 try (BufferedReader br = new BufferedReader(new FileReader("./res/employees.txt"))) {
//			 String line;
//			 
//			 while ((line = br.readLine()) != null) {
//				 String[] lists = line.split(":");
//				 Employee EmployeeLines = new Employee(lists[0], lists[1], lists[2], lists[3], Long.parseLong(lists[4]), lists[5], lists[6]);
//				 employee.add(EmployeeLines);
//				 }
//		 } catch (IOException e) {
//				e.printStackTrace();
//			}
//	}
	
//	public void empPayGrade() {
//		for(Employee x : employee ) {
//			char firstChar = x.id.charAt(0);
//			if ( '0' <= firstChar && firstChar <= '4')  {
//				Employee salary = new Salaried();
//			} else if ('5' <= firstChar && firstChar <= '7') {
//				Employee wage = new Wages();
//			} else if ('8' <= firstChar && firstChar <= '9') {
//				Employee partTime = new PartTime();
//			}
//		}
//	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public long getSin() {
		return sin;
	}


	public void setSin(long sin) {
		this.sin = sin;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
////	Still need to figure this section out (how to pull from child into parent
//	public double averageWeeklyPayAllEmp(double rate, double hours, double salary) {
//		double x = hours * rate;
//		double total = x * salary;
////		System.out.println("The average pay for all employees is: " + total);
//		return total;
//	}
//	

	public String toString() {
		return id + ":" + name + ":" + address + ":" + phone + ":" + sin + ":" + dob + ":" + dept;
	}

	public double getPay() {
		return 0;
		}
}
