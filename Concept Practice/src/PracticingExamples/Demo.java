package PracticingExamples;
class Demo {
	public static void main(String[] args) {
//int a = 10;
//System.out.println(a++ + ++a + a + --a);
		
		Cat cat = new Cat();
		cat.groom();
		cat.shed();
		Hairy.walkAroundBeingHairy();
	}
}

interface Hairy{
	abstract void shed();
	default void groom() {
		System.out.println("grooming fur");
	}
	static void walkAroundBeingHairy() {
		System.out.println("I'm walking around being very hairy!");
	}
}


class Animal{

}

class Cat extends Animal implements Hairy{
	public void shed() {
		System.out.println("I shed in May");
	}
	
	public void groom() {
		System.out.println("I lick my fur when I eat tasty food");
	}
	
	public void walkAroundBeingHairy() {}
	
}