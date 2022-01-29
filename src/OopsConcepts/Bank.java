package OopsConcepts;

public abstract class Bank {
	
		
	public abstract void loan();
	public abstract void loan(String str);
	public abstract void loan(int str);
	public abstract void withdraw();
	public void credit() {
		System.out.println("From Bank Absract credit");
	}
	
	
	public void debit() {
		System.out.println("From Bank Absract debit");
	}
	

}
