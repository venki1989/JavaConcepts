package concepts;

public class Constructors {
	
	
	Constructors()
	{
		System.out.println("This is constructor without parameters");
	}
	
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
	
	public static void main(String[] args) {
        
		Constructors ref1 = new Constructors();
//		Constructors ref2 = new Constructors(100,200);
//		Constructors ref3 = new Constructors(100,"name");
		copy ref = ref1.new copy(100, "anotherName");
		copy ref4 = ref1.new copy(ref);
		
		
	}

}
