package concepts;

public class SuperMethod {

	public static void main(String[] args) {
		SuperClassMethod2 r = new SuperClassMethod2();
        r.superclassmethod();		
		
	}

}

class SuperClassMethod1

{
	void superclassmethod(int a)
	{
		System.out.println("I am from Super class method with value "+a);
	
	}
	
}

class SuperClassMethod2 extends SuperClassMethod1

{
	void superclassmethod()
	{
		super.superclassmethod(20);
		System.out.println("I am from sub class method ");
	
	}
	
}