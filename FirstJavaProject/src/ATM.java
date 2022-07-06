
public class ATM {
	//instance variable or instance variaable

	//member variable or instance variable or object variable
	private double amount;
	
	//No-Arguments constructor
	ATM(){
		amount=1000;
	}
	ATM(double amount)
	{
		this.amount=amount;
	}
	
	@Override
	public String toString() {
		return "ATM [amount=" + amount + "]";
	}
	
		
	public void deposit(double amount)//10000
	{
		this.amount=this.amount+amount;
		//1000=1000+10000
	}
	public double withdraw(double amount)
	{
		this.amount=this.amount-amount;
		return this.amount;
	}
	public double checkBalance()
	{
		return amount;
	}

	}



