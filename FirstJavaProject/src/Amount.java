
public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
		
		System.out.println(atm);
		atm.deposit(10000);
		System.out.println(atm);
		double amount=atm.withdraw(3000);
		//System.out.println("withdraw amount = "+amount);
		
		System.out.println(atm.checkBalance());
		
		ATM atm1=new ATM(10000);
		atm1.deposit(9000);
		System.out.println(atm1);
	}

	}
