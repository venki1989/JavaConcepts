package OopsConcepts;

public class HDFC extends Bank {

	@Override
	public void loan() {
		System.out.println("This is from HDFC loan overridden");
		
	}
	
	@Override
	public void credit()
	{
		System.out.println("This is from HDFC credit overridden");
		
	}
	
	public void debit()
	{
		System.out.println("Thi is from HDFC debit from HDFC");
	}
	
	public void self()
	{
		System.out.println("This is from HDFC new");
	}

	@Override
	public void loan(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loan(int str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
