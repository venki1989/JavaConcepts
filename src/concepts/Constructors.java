package concepts;

public class Constructors {
	String name;
	int age;
	long ssn;
	
//	Constructors()
//	{
//		System.out.println("This is constructor without parameters");
//	}
	
	Constructors(int a, int b)
	{
		System.out.println("This is constructor with int parameters "+a+" and "+b);
	}
	
	Constructors(int a, String b)
	{
		System.out.println("This is constructor with int and String parameters "+a+" and "+b);
	}
	//Copy Constructor
	public class copy
	{
		int a; String b;
		
		copy(int a,String b)
		{
			this.a=a;
			this.b=b;
			System.out.println("Original contructor method  "+a+" "+b);
		}
		
		
		copy(copy r)
		{
		    a=r.a;
		    b=r.b;
		   System.out.println("This is copied constructor "+a+" "+b);
		}
	}
	
	
	
	
	public Constructors(String name, int age, long ssn)
	{
		this.name=name;
		this.age=age;
		this.ssn=ssn;
				
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
        
		Constructors con = new Constructors("me",25,878463);
		System.out.println(con.name+" "+" "+ con.age +" " + con.ssn);
		
		
//		Constructors ref2 = new Constructors(100,200);
//		Constructors ref3 = new Constructors(100,"name");
	//	copy ref = ref1.new copy(100, "anotherName");
	//	copy ref4 = ref1.new copy(ref);
		
		
	}

}
