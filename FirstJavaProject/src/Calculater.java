

	  import java.util.Scanner;
	     public class Calculater 
	{
	        public static void main(String[] args)
	 {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the first number: ");
	  int n1 = scanner.nextInt();
	 
	 System.out.println("Enter the second number: ");
	  int n2 = scanner.nextInt();
	  int sum = n1 + n2;
	 
	  int minus = n1 - n2;

	  int multiply = n1 * n2;

	  int divide = n1 / n2;
	 
	  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nDivide = %d\n ", sum, minus, multiply,divide);
	 }

		static int multiplication(int x,int y)
		{
			return x*y;
		}
		static int division(int x,int y)
		{
			return x/y;
		}
		
}

