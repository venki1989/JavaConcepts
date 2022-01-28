package concepts;

public class ExceptionHandeling {

	public static void main(String[] args) {
		int a=10, b=0, c;


		try
		{
			c=a/b;
			System.out.println(c);

		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: Dividing by zero invalid");
		}

	}

}
