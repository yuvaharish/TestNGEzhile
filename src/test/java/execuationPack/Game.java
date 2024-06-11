package execuationPack;


@FunctionalInterface
public interface Game {

	public abstract void start();
	
	public static void cricket() {
		System.out.println("Cricket");
	}
}
