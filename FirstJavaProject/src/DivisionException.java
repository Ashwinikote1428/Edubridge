import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1,num2,num3=0;
     Scanner sc=new Scanner(System.in);
     num1=sc.nextInt();
     num2=sc.nextInt();
     try {
    	 num3=num1/num2;
    	 }catch(Exception Ex)
     {
    		 System.out.println(Ex.getMessage());
     }
     System.out.println("result" +num3);
	}

}
