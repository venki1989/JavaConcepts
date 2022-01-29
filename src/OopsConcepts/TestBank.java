package OopsConcepts;

public class TestBank {

	public static void main(String[] args) {
		HDFC hd = new HDFC();
		hd.credit();
		hd.debit();
		hd.self();
		hd.loan();
		
		Bank bank = new HDFC();
		bank.credit();
		bank.debit();
		bank.loan();
		
		
		

	}

}
