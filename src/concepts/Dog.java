package concepts;

public class Dog extends Animal {




	@Override
	public void AnimalEat()
	{
		System.out.println("Dog Eating");
	}
	
	

	public static void main(String[] args) {
      Dog dog = new Dog();
      dog.AnimalEat();
		
	}

}
