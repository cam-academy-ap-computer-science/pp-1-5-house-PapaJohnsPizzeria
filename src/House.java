public class House {
	public static void main(String[] args) {
		jack();
		malt();
		rat();
		cat();
		dog();
		cow();
		maiden();
	}
	public static void jack() {
		System.out.println("This is the house that Jack built.");
		System.out.println("");
	}
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
		System.out.println("");
	}
	public static void malt() {
		System.out.println("This is the malt");
		house();
	}
	public static void rat() {
		System.out.println("This is the rat,");
		thatMalt();
		house();
	}
	public static void cat() {
		System.out.println("This is the cat,");
		thatRat();
		thatMalt();
		house();
	}
	public static void dog() {
		System.out.println("This is the dog,");
		thatCat();
		thatRat();
		thatMalt();
		house();
	}
	public static void cow() {
		System.out.println("This is the cow with the crumpled horn,");
		thatDog();
		thatCat();
		thatRat();
		thatMalt();
		house();
	}
	public static void maiden() {
		System.out.println("This is the maiden all forlorn");
		thatCow();
		thatDog();
		thatCat();
		thatRat();
		thatMalt();
		house();
	}
	public static void thatMalt() {
		System.out.println("That ate the malt");
	}
	public static void thatRat() {
		System.out.println("That killed the rat,");
	}
	public static void thatCat() {
		System.out.println("That worried the cat,");
	}
	public static void thatDog() {
		System.out.println("That tossed the dog,");
	}
	public static void thatCow() {
		System.out.println("That milked the cow with the crumpled horn,");
	}
}
