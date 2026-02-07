package p00;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManager {
	
	private static ArrayList<Employee> employee = new ArrayList<>();
	
	public EmployeeManager() {
		loadEmployeeList();
		System.out.println("The average pay for all employees is: " + averageWeeklyPayAllEmp());
		System.out.println("The Wages employee with the highest pay is: " + highestWageWeeklyPayEmp());
		System.out.println("The Salaried employee with the lowest pay is: " + salariedLowestPayEmp());
		System.out.println("Percentage of Salaried employees is: " + percentOfSalariedEmp() + "%");
		System.out.println("Percentage of Wages employees is: " + percentOfWageEmp() + "%");
		System.out.println("Percentage of Part Time employees is: " + percentOfPartTimeEmp() + "%");
	}

	
	private void loadEmployeeList() {
		 try (BufferedReader br = new BufferedReader(new FileReader("./res/employees.txt"))) {
			 String line;
			 
			 while ((line = br.readLine()) != null) {
				 String[] lists = line.split(":");
				 char firstChar = lists[0].charAt(0);
				 Employee emp = null;
					if ( '0' <= firstChar && firstChar <= '4')  {
						emp = new Salaried(lists[0], lists[1], lists[2], lists[3], Long.parseLong(lists[4]), lists[5], lists[6], Double.parseDouble(lists[7]));
					} else if ('5' <= firstChar && firstChar <= '7') {
						emp = new Wages(lists[0], lists[1], lists[2], lists[3], Long.parseLong(lists[4]), lists[5], lists[6], Double.parseDouble(lists[7]), Double.parseDouble(lists[8]));
					} else if ('8' <= firstChar && firstChar <= '9') {
						emp = new PartTime(lists[0], lists[1], lists[2], lists[3], Long.parseLong(lists[4]), lists[5], lists[6], Double.parseDouble(lists[7]), Double.parseDouble(lists[8]));
					}
				 employee.add(emp);
				 }
		 } catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public double averageWeeklyPayAllEmp() {
		double total = 0;
		for(Employee x: employee) {
			total += x.getPay();
		} return total / employee.size();
	}
	
	public String highestWageWeeklyPayEmp() {
		String highestPayEmp = "";
		double highestPaySoFar = 0;
		double empWeeklyPay = 0;
		for (Employee emp : employee) {
			if (emp instanceof Wages) {
				empWeeklyPay = emp.getPay();
				if (empWeeklyPay > highestPaySoFar) {
					highestPaySoFar = empWeeklyPay;
					highestPayEmp = emp.getName();
				}
			}
		}return highestPayEmp;
	}
	
	public String salariedLowestPayEmp() {
		String lowestPayEmp = "";
		double lowestPaySoFar = Double.POSITIVE_INFINITY;
		double empWeeklyPay;
		for (Employee emp : employee) {
			if (emp instanceof Salaried) {
				empWeeklyPay = emp.getPay();
				if (empWeeklyPay < lowestPaySoFar) {
					lowestPaySoFar = empWeeklyPay;
					lowestPayEmp = emp.getName();
				}
			}
		}return lowestPayEmp;
	}
	
	public double percentOfSalariedEmp() {
		double salaryEmpSize = 0; 
		for(Employee emp : employee) {
			if (emp instanceof Salaried) {
				salaryEmpSize += 1;
			}
		}
		return (salaryEmpSize / employee.size()) * 100 ;
	}
	
	public double percentOfWageEmp() {
		double WagesEmpSize = 0; 
		for(Employee emp : employee) {
			if (emp instanceof Wages) {
				WagesEmpSize += 1;
			}
		}
		return (WagesEmpSize / employee.size()) * 100 ;
	}
	
	public double percentOfPartTimeEmp() {
		double partTimeEmpSize = 0; 
		for(Employee emp : employee) {
			if (emp instanceof PartTime) {
				partTimeEmpSize += 1;
			}
		}
		return (partTimeEmpSize / employee.size()) * 100 ;
	}
	
	
}
