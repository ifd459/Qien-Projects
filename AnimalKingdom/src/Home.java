
public class Home {

	public static void main(String[] args) {
		System.out.println("Welcome home!");
		referenceVariableTypes();
	}

	public static void referenceVariableTypes() {
		// bitey is the Cat class reference variable for object Cat.
		Cat bitey = new Cat();
		bitey.favouriteSnack = "everything";
		bitey.name = "Nibbles";

		// try accessing object with reference variable of own kind
		System.out.println("Meet " + bitey.name);
		System.out.println("This animal is owned by someone: " + bitey.owned);
		System.out.println(bitey.name + "'s favourite snack is " + bitey.favouriteSnack);
		Domesticated.stareAtOwnerUntilFed();

		// try accessing object with reference variable of superclass kind
		Animal fishAnimal = new Animal();
//	fishAnimal.bloop();    - this doesn't work, as it was created in class Fish, not class Animal
		System.out.println("This animal not single celled: " + fishAnimal.multiCell); // works!
//	fishAnimal.stareAtOwnerUntilFed();   - also doesn't work, as animal does not implement domesticated

		// try accessing object with reference variable of interface kind

		Domesticated domesticated = new Cat();
		// can't access members of Cat or Animal
		System.out.println("This animal " + domesticated.home);
		
		
		
		//cast the variable of type domesticated to type Cat
		((Cat)domesticated).favouriteSnack = "Everything";
	}
	

}
