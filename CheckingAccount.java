
public class CheckingAccount implements HasMenu
	double balance;

	public static main(String[], args);
		CheckingAccount()
	}
	public CheckingAccount(){
		balance = 0
	}
	public void CheckingAccount(double balance){
		this.balance = balance
	}
	public String menu(){
	}
	public double getBalance(){
		return this.balance;
	}
	public String getBalanceString(){
		String balanceString = String.valueof(this.balance)
		return balanceString
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void checkBalance(){
	}
	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String sResult = input.nextline();
		double result = 0d;
		try {
			result = double.parseDouble(sResult);
		} catch (exception e){
			system.out.println("invalid input changin to 0");
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
		this.balance -= deposit;
	}
}// end class def
