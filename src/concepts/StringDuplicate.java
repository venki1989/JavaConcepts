package concepts;

public class StringDuplicate {
	//remove duplicate charact
	public static void main(String[] args) {

		String str="1123332331445566";
		StringBuilder sb=new StringBuilder();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}

			}
			if(!repeated)
			{
				sb.append(arr[i]); //bot
			}
		}
		System.out.println("Remove Dup using CharArray for loop :"+sb);

		//Remove Duplicate using String builder

		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		/*Char returns each char of the string, distinct returns
		the single occurrence within the string, for each loop through the char, 
		append the distinct characters only*/
		System.out.println("Remove Dup using Lamda and StringBuilder for Each :"+sb1);


		//Reverse Number
		int number = 1212;
		int rev=0;
		int OriginalNum=number;

		while(number!=0)
		{
			rev=rev*10 + number%10;
			System.out.println(rev);
			number=number/10;
		}
		if(rev==OriginalNum) {
			System.out.println("its a Palindrome number :" +rev);
		}
		else
		{
			System.out.println("reverse number is " +rev);
		}

		
		long number2=12345;
		StringBuilder sb2 = new StringBuilder();
		sb2.append(number2);
		System.out.println("Reverse of int using stringbuilder " +sb2.reverse());

		StringBuffer sb3 =new StringBuffer(String.valueOf(number2));
		StringBuffer revint=sb3.reverse();
		System.out.println("Rever int using String buffer "+ revint);

	}

}
