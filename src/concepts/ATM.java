package concepts;

import java.util.Scanner;

class Transaction

{
	private int bal=10000;
	private String pwd="Venki123";
	private int customerID=123;
	Scanner scan;
	//Create methods of action like deposite, withdraw

	void checkBalance()
	{
		System.out.println("Enter CustomerID: ");
		scan=new Scanner(System.in);
		int mask=scan.nextInt();


		if(mask==customerID)
		{
			System.out.println("Enter Password: ");
			String EnteredPassword =scan.next();
			if (EnteredPassword.equals(pwd))
			{
				System.out.println("Account balance is "+bal);
			}
			else
			{
				System.out.println("Invalid password");
			}


		}
		else
		{
			System.out.println("Invalid CustomerID");
		}
	}

	void deposit()
	{
		{
			System.out.println("Enter CustomerID: ");
			scan = new Scanner(System.in);
			int mask=scan.nextInt();


			if(mask==customerID)
			{
				System.out.println("Enter Password: ");
				String EnteredPassword =scan.next();
				if (EnteredPassword.equals(pwd))
				{
					System.out.println("Enter Amount to deposit: ");
					int money=scan.nextInt();
					bal=bal+money;
					System.out.println("Account balance is "+bal);
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
			else
			{
				System.out.println("Invalid CustomerID");
			}
		}

	}


	void withdraw()
	{
		{
			System.out.println("Enter CustomerID: ");
			scan=new Scanner(System.in);
			int mask=scan.nextInt();


			if(mask==customerID)
			{
				System.out.println("Enter Password: ");
				String EnteredPassword =scan.next();
				if (EnteredPassword.equals(pwd))
				{
					System.out.println("Enter Amount to withdraw: ");
					int money=scan.nextInt();
					bal=bal-money;
					System.out.println("Account balance is "+bal);
				}
				else
				{
					System.out.println("Invalid password");
				}
			}
			else
			{
				System.out.println("Invalid CustomerID");
			}
		}
	}

}

public class ATM {



	public static void main(String[] args) {
		Transaction trans = new Transaction();
		System.out.println("Select the transaction required: \n"
				+ " 1 : To Deposit\n"
				+ " 2 : To Withdraw\n"
				+ " 3 : To Check Balance\n");
		try (Scanner option = new Scanner(System.in)) {
			int SelectOption = option.nextInt();

			switch(SelectOption)
			{
			case 1:
				System.out.println("Selected Deposit Transaction"); 
				trans.deposit();
				break;
			case 2:
				System.out.println("Selected Withdraw Transaction");
				trans.withdraw();
				break;
			case 3:
				System.out.println("Selected Balance enquiry ");
				trans.checkBalance();
				break;
			default:
			System.out.println("Invalid transaction selected");
			break;

			}
		}

	}
}
