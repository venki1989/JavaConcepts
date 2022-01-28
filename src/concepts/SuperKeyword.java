package concepts;

class SuperClass
{

	int a=10;
	void show()
	{
		System.out.println("Data from super class "+a);
	}

}

class subClass extends SuperClass
{
	int a=20;
	void show()
	{
		System.out.println("Data from super class "+a);
		System.out.println("Data from super class "+super.a);
	}
}

public class SuperKeyword

{

	public static void main(String[] args)
	{

		subClass r= new subClass();
		r.show();

	}

}


