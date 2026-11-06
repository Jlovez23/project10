class SavingsAccount extends CheckingAccount{
    	double interestRate
    
    	public static void main(String[] args){
    	}
	void calcInterest(){
		this.balance() += (this.getBalance * this.getInterestRate());
	}
	void setInterestRate(){
		this.interestRate = interestRate
	}
	double getInterestRate(){
		return this.interestRate;
	}
}
