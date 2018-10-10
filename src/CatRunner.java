
public class CatRunner {

	public static void main(String[] args) {
		Cat gregorny = new Cat("Gregorny");
		gregorny.meow();
		gregorny.printName();
		for (int i = 0; i < 9; i++) {
		gregorny.kill();
		}
	}
}
