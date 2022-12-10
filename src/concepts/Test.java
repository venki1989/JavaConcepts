package concepts;

public class Test {

	public static void main(String[] args) {

		String str = "My name is venkatesh";
		int i;
		// replace my =>your, is=>this
		// Create Array --
		// lopping the array my=>your, is==>this
		// Udate map
		String[] arr = str.split(" ");
		for (i = 0; i < arr.length; i++) {
			if (arr[i].equals("My"))
				
			{
				arr[i] = "your";
			}
			
			
			if (arr[i].equals("is"))
				
			{
				arr[i] = "this";
			}
			
				System.out.println(arr[i]);

		}

	}
}
