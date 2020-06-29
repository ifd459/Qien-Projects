
public class Fish extends Animal implements Domesticated{
int numberOfFins;
String name;

public void bloop() {
	System.out.println("Bubbles sound like bloop bloop bloop");
}

@Override
public void recieveUnwantedLove() {
System.out.println("This love is uneccesary. All I do is bloop.");
	
}
}
