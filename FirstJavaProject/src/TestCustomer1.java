
public class TestCustomer1 {


	public static void main(String[] args)
 {
		
	Customer1 customer1 = new Customer1();
	System.out.println(customer1);	
           customer1.setId(101);	
	   customer1.setName("Sachin");
	   customer1.setAddress("Banglore");
	   customer1.setEmail_id("sachin156@gmail.com");
           customer1.setPhone_no("9373349256");
       System.out.println("Customer ID = "+customer1.getId() +" Customer Name = "+customer1.getName() +" Customer Address = "+customer1.getAddress()+" Customer Email ID = "+customer1.getEmail_id()+" Customer Phone = "+customer1.getPhone_no());
	
         Customer1 customer2 = new Customer1();
         System.out.println(customer2);	
            customer2.setId(102);	
            customer2.setName("Gayatri");
            customer2.setAddress("Pune");
            customer2.setEmail_id("gayatri99@gmail.com");
            customer2.setPhone_no("7218653856");
       System.out.println("Customer ID = "+customer2.getId() +" Customer Name = "+customer2.getName() +" Customer Address = "+customer2.getAddress()+" Customer Email ID = "+customer2.getEmail_id()+" Customer Phone_no = "+customer2.getPhone_no());
	
         Customer1 customer3 = new Customer1();
         System.out.println(customer3);	
            customer3.setId(103);	
            customer3.setName("Ananya");
            customer3.setAddress("Mumbai");
            customer3.setEmail_id("anuu1307@gmail.com");
            customer3.setPhone_no("9035674321");
       System.out.println("Customer ID = "+customer3.getId() +" Customer Name = "+customer3.getName() +" Customer Address = "+customer3.getAddress()+" Customer Email ID = "+customer3.getEmail_id()+" Customer Phone_no = "+customer3.getPhone_no());
}
}