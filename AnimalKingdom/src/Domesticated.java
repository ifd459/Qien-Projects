
public interface Domesticated {
boolean owned = true;
String home = "lives at home";
public void recieveUnwantedLove();
default void catType() {
	System.out.println("domesticated");
}
static public void stareAtOwnerUntilFed() {
	System.out.println("\nstaring at owner");
	System.out.println("praying for food before death");
	System.out.println("how dare you insinuate I am being dramatique");
}
}
