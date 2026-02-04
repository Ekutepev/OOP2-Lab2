package p00;

public class OutPut {
	
//	private static ArrayList<Employee> employee = new ArrayList<>();
//	
//	private static void loadEmployeeList() {
//		 try (BufferedReader br = new BufferedReader(new FileReader("./res/employee.txt"))) {
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

	public static void main(String[] args) {
		
		new Employee();
		
	}

}
