
public class EmployeeDetails {

	 int empId;
	 String name;
	 String add;
	 String phone;
	 String email;
	 
	 

	public static void main(String[] args) {
		 {
				EmployeeDetails employee= new EmployeeDetails();//declaration and initialization or object
				employee.empId=1010;
				employee.name="Nayan";
				employee.add="Pune";
				employee.phone="9876434567";
			    employee.email="nayann23@gmail.com";

				System.out.println(employee.empId);
				System.out.println(employee.name);
				System.out.println(employee.add);
				System.out.println(employee.phone);
				System.out.println(" ");
					
		        EmployeeDetails employee_1 = new EmployeeDetails();
		        employee_1.empId=1011;
		        employee_1.name="Riva";
		        employee_1.add="Mumbai";
		        employee_1.phone="8923357250";
		        employee_1.email="rivas73@gmail.com";

		        System.out.println(employee_1.empId);
		        System.out.println(employee_1.name);
		        System.out.println(employee_1.add);
		        System.out.println(employee_1.phone);
		        System.out.println(" ");
		        
		        EmployeeDetails employee_2 = new EmployeeDetails();
		        employee_2.empId=1012;
		        employee_2.name="Ashuu";
		        employee_2.add="Nagpur";
		        employee_2.phone="9065101215";
		        employee_2.email="ashu@gmail.com";

		        System.out.println(employee_2.empId);
		        System.out.println(employee_2.name);
		        System.out.println(employee_2.add);
		        System.out.println(employee_2.phone);
		}
		}

		//with static method
		public class Employee 
		       {

				public int empId;
				public String name;
				public String add;
				public String email;
				public String phone;

			}


}
