
public class CheckingAccount implements HasMenu{
	double balance;

	public static void main(String[] args){
		CheckingAccount();
		start();
	}
	public CheckingAccount(){
		balance = 0;
	}
	public void CheckingAccount(double balance){
		this.balance = balance;
	}
	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			response = menu();
			if (response = "0")
				keepGoing = false;
			else if (response = "1")
				this.checkBalance();
			else if (response = "2")
				this.makeDeposit();
			else if (response = "3")
				this.makeWithdrawal();
			else 
				System.out.println("invalid input. You put " + response);
		}
	}
	public String menu(){
		System.out.println("press 0 to quit");
		System.out.println("press 1 to check balance");
		System.out.println("press 2 to make a deposit");
		system.out.println("press 3 to make a withdrawal");
		Scanner input = new Scanner(System.in);
		String response = input.nextline();
		return response;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getBalanceString(){
		String balanceString = String.valueof(this.balance);
		return balanceString;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void checkBalance(){
		System.out.println("Current Balance: " + this.getBalanceString());
	}
	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String sResult = input.nextline();
		double result = 0d;
		try {
			result = double.parseDouble(sResult);
		} catch (exception e){
			system.out.println("invalid input changing to 0");
			result = 0d;
		}
		return result;
	}
	public void makeDeposit(){
		System.out.println("how much to deposit?");
		double deposit = this.getDouble();
		this.balance += deposit;
	}
	public void makeWithdrawal(){
		System.out.println("how much to withdrawl?");
		double withdrawal = this.getDouble();
		if (withdrawal > this.getDouble()){
			System.out.println("Insufficient balance");
		} else {
			this.balance -= withdrawal;
			System.out.println("withdrawal complete \n new balance: " + this.getBalanceSring());
		}
	}
}// end class def
